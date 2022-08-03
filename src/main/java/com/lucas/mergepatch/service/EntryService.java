package com.lucas.mergepatch.service;

import com.lucas.mergepatch.domain.Account;
import com.lucas.mergepatch.domain.Entry;
import com.lucas.mergepatch.domain.Owner;
import com.lucas.mergepatch.representation.EntryRepresentation;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EntryService {

    public Entry findEntry(String key) {
        return Entry
                .builder()
                .key(key)
                .owner(Owner.builder()
                        .taxIdNumber(RandomStringUtils.randomNumeric(11))
                        .name(RandomStringUtils.randomAlphabetic(20))
                        .type(RandomUtils.nextInt(0, 2) > 0 ? "LEGAL_PERSON" : "NATURAL_PERSON")
                        .tradeName(RandomStringUtils.randomAlphabetic(20))
                        .build())
                .account(Account.builder()
                        .accountType("CC")
                        .branch(RandomStringUtils.randomNumeric(4))
                        .openingDate("2022-08-02")
                        .accountNumber(RandomStringUtils.randomNumeric(12))
                        .participant("59588111")
                        .build())
                .reason("USER_REQUESTED")
                .build();
    }

}
