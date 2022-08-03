package com.lucas.mergepatch.representation;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Optional;

@Data
public class EntryRepresentation {

    @NotNull
    private String key;

    @Valid
    private Optional<@NotNull AccountRepresentation> account;

    @Valid
    private Optional<@NotNull OwnerRepresentation> owner;

    @NotNull
    private String reason;

}
