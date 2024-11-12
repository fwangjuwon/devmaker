package org.example.dmaker.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevDtoTest {
    @Test
    void test(){
        DevDto devDto = new DevDto();

        devDto.setName("juwon");
        System.out.println(devDto.getName());
    }

}