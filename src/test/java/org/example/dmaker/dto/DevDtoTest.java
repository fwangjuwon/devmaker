package org.example.dmaker.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class DevDtoTest {
    @Test
    void test(){
        DevDto devDto = DevDto.builder()
                .name("gaeddo")
                .age(30)
                .startAt(LocalDateTime.now())
                .build();

        System.out.println(devDto);
        devDto.printLog();

    }


}