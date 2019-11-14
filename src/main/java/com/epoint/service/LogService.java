package com.epoint.service;

import com.epoint.core.Service;
import com.epoint.model.dto.LogDTO;
import com.epoint.model.entity.Log;
import com.epoint.model.enums.LogType;
import org.springframework.lang.NonNull;

import java.util.List;

public interface LogService extends Service<Log> {
    List<Log> listLogByType(LogType logType);

    @NonNull
    public LogDTO convertTo(@NonNull Log log) ;

}
