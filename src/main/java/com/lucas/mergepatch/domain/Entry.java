package com.lucas.mergepatch.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Entry {

    private String key;
    private Account account;
    private Owner owner;
    private String reason;

}
