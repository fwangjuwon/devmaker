package org.example.dmaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperLevel {
    NEW("신입 개발자"),
    JUNIOR("중니어"),
    JONGNIOR("종니어"),
    SENIOR("시니어")
    ;
    private final String description;

}
