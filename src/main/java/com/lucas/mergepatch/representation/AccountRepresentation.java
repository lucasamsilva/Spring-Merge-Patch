package com.lucas.mergepatch.representation;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Optional;


@Data
public class AccountRepresentation {

    private Optional<@NotBlank String> participant;
    private Optional<@NotBlank String> accountNumber;
    private Optional<@NotBlank String> accountType;
    private Optional<@NotBlank String> branch;
    private Optional<@NotBlank String> openingDate;


}
