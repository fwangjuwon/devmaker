package org.example.dmaker.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dmaker.service.DMakerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//사용자의 입력이 최초로 받아들여지는 곳
//컨트롤러인데 response body를 자동으로 받아주겠다.. (빈으로 등록하는 방식)
//json으로 값을 내려줄 것이다! 사용자의 요청을 받아서 json의 값으로 응답을 내려주겠따.


@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {

    private final DMakerService dmakerService;
    @GetMapping("/developers")
    public List<String> getAllDevelopers(){
        log.info("GET /developers HTTP/1.1");

        return Arrays.asList("gaeddo","juwon","bokrae");

    }


    @GetMapping("/create-developer")
    public List<String> createDeveloper(){
        log.info("GET /createDeveloper HTTP/1.1");
        dmakerService.createDeveloper();
        return Collections.singletonList("Olaf");
    }
}
