package com.lucas.mergepatch.representation;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Data
public class OwnerRepresentation {

    private Optional<@NotBlank String> type;
    private Optional<@NotBlank String> taxIdNumber;
    private Optional<@NotBlank String> name;
    private Optional<String> tradeName;

}
