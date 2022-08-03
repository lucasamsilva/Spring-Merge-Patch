package com.lucas.mergepatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringReader;

@Service
public class MergePatchService {

    @Autowired
    private ObjectMapper mapper;

    public <T> Object mergePatch(T source, T request, Class clazz) {
        try {
            var sourceJson = objectToJsonObject(source);
            var requestJson = objectToJsonObject(request);
            return jsonValueToObject(merge(sourceJson, requestJson), clazz);
        } catch (Exception e) {
            System.out.println("Error on Parse");
            throw new RuntimeException();
        }
    }

    private Object jsonValueToObject(JsonValue json,Class clazz) throws JsonProcessingException {
        return mapper.readValue(json.toString(), clazz);
    }

    private <T> JsonObject objectToJsonObject(T object) throws JsonProcessingException {
        var objString = mapper.writeValueAsString(object);
        return Json.createReader(new StringReader(objString)).readObject();
    }

    private JsonValue merge(JsonValue source, JsonValue request) {
        return Json.createMergePatch(request).apply(source);
    }

}
