package com.lucas.mergepatch.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String participant;
    private String accountNumber;
    private String accountType;
    private String branch;
    private String openingDate;

}
