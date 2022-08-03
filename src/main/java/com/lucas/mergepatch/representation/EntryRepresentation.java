package com.lucas.mergepatch.representation;

import lombok.Builder;
import lombok.Data;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
public class EntryRepresentation {

    @NotNull
    private String key;

    @Valid
    private JsonNullable<AccountRepresentation> account;

    @Valid
    private JsonNullable<OwnerRepresentation> owner;

    @NotNull
    private String reason;

}
