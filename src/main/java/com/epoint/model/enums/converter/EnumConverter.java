package com.epoint.model.enums.converter;

import com.epoint.model.enums.ArticleType;
import com.epoint.model.enums.LogType;
import com.epoint.model.enums.ValueEnum;
import org.apache.ibatis.type.MappedTypes;

/**
 * 枚举转换器，查询/保存到数据库时调用
 * @param <E>
 */
@MappedTypes({LogType.class,ArticleType.class})
public class EnumConverter<E extends Enum<E> & ValueEnum> extends AbstractEnumConverter<E> {
    public EnumConverter(Class<E> type) {
        super(type);
    }
}
