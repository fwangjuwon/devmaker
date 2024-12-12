package org.example.dmaker.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
public class DevDto {

    String name;
    Integer age;
    LocalDateTime startAt;

}
