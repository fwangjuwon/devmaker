package org.example.dmaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperSkillType {

    BACKEND("백엔드"),
    FRONTEND("프론트"),
    FULL("플스택")
    ;

    private final String description;
}
