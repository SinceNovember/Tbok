package com.epoint.controller;

import com.epoint.model.dto.LogDTO;
import com.epoint.model.entity.Log;
import com.epoint.model.params.LogParam;
import com.epoint.service.LogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
public class LogController {

    @Resource
    private LogService logService;

    @PostMapping("/test")
    public LogDTO test(@Valid LogParam logParam) {
        Log log = logParam.convertTo();
        return logService.convertTo(logService.save(log));
    }
}
