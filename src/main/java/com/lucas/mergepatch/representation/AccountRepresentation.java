package com.lucas.mergepatch.representation;

import com.lucas.mergepatch.annotations.ContentNotBlank;
import lombok.Builder;
import lombok.Data;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.constraints.NotNull;


@Data
public class AccountRepresentation {

    @ContentNotBlank
    private JsonNullable<String> participant;
    @ContentNotBlank
    private JsonNullable<String> accountNumber;
    @ContentNotBlank
    private JsonNullable<String> accountType;
    @ContentNotBlank
    private JsonNullable<String> branch;
    @ContentNotBlank
    private JsonNullable<String> openingDate;


}
