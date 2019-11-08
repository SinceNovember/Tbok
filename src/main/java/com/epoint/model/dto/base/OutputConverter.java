package com.epoint.model.dto.base;

import com.epoint.utils.ConvertUtils;
import org.springframework.lang.NonNull;

public interface OutputConverter <DTO extends OutputConverter<DTO,DOMAIN>,DOMAIN>{

    default  <T extends DTO> T covertFrom(@NonNull DOMAIN domain) {
        ConvertUtils.updateProperties(domain,this);
        return (T) this;
    }
}
