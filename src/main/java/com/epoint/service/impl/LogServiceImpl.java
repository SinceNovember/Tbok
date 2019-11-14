package com.epoint.service.impl;

import com.epoint.core.AbstractService;
import com.epoint.dao.LogMapper;
import com.epoint.model.dto.LogDTO;
import com.epoint.model.entity.Log;
import com.epoint.model.enums.LogType;
import com.epoint.service.LogService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogServiceImpl extends AbstractService<Log> implements LogService {

    @Resource
    private LogMapper logMapper;


    @Override
    public List<Log> listLogByType(LogType logType) {
        return logMapper.listLogByType(logType);
    }

    public LogDTO convertTo(Log log) {
        Assert.notNull(log,"Log must not be null");
        return new LogDTO().covertFrom(log);
    }
}
