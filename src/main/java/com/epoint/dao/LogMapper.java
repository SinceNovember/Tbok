package com.epoint.dao;

import com.epoint.core.MyMapper;
import com.epoint.model.entity.Log;
import com.epoint.model.enums.LogType;

import java.util.List;

public interface LogMapper extends MyMapper<Log> {
    List<Log> listLogByType(LogType logType);
}
