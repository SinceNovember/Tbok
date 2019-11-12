package com.epoint.controller;

import com.epoint.model.dto.LogDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @PostMapping("/test")
    public String test(LogDTO logDTO) {
        System.out.println(logDTO);
        System.out.println("ddddd");
        return "success";
    }
}
