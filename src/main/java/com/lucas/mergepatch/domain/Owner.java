package com.lucas.mergepatch.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Owner {

    private String type;
    private String taxIdNumber;
    private String name;
    private String tradeName;
}
