package com.epoint.controller.api;

import com.epoint.model.dto.LogDTO;
import com.epoint.model.entity.Log;
import com.epoint.model.params.LogParam;
import com.epoint.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class LogController {

    @Resource
    private LogService logService;

    @GetMapping("/test")
    public LogDTO test(@Valid LogParam logParam) {
        List<Log> log = logService.findAll();
//        Log log = logParam.convertTo();
        return logService.convertTo(log.get(0));
    }
}
