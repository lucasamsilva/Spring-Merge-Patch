package com.lucas.mergepatch.representation;

import com.lucas.mergepatch.annotations.ContentNotBlank;
import lombok.Data;
import org.openapitools.jackson.nullable.JsonNullable;

@Data
public class OwnerRepresentation {

//    @ContentNotBlank
    private JsonNullable<String> type;
//    @ContentNotBlank
    private JsonNullable<String> taxIdNumber;
//    @ContentNotBlank
    private JsonNullable<String> name;
    private JsonNullable<String> tradeName;

}
