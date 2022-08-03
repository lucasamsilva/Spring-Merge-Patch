package com.lucas.mergepatch.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucas.mergepatch.domain.Entry;
import com.lucas.mergepatch.representation.EntryRepresentation;
import com.lucas.mergepatch.service.EntryService;
import com.lucas.mergepatch.service.MergePatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v2/entry")
public class EntryController {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private EntryService entryService;

    @Autowired
    private MergePatchService mergePatch;

    @PatchMapping
    Entry updateEntry(@RequestBody @Valid EntryRepresentation entryUpdate) {
        try {
            var entry = entryService.findEntry(entryUpdate.getKey());
            return (Entry) mergePatch.mergePatch(entry ,entryUpdate, Entry.class);
        } catch (Exception e) {
            System.out.println("Azedou");
        }
        return null;
    }

}
