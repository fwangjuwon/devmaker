package org.example.dmaker.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class DevDto {

    String name;
    Integer age;
    LocalDateTime startAt;

}
