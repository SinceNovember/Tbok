//package com.epoint.model.enums.converter;
//
//import com.epoint.model.enums.ValueEnum;
//import javax.persistence.AttributeConverter;
//
//public abstract class AbstractConverter<E extends ValueEnum<V>, V> implements AttributeConverter<E, V> {
//    private final Class<E> clazz;
//
//    protected AbstractConverter(Class<E> clazz) {
//        this.clazz = clazz;
//    }
//
//    @Override
//    public V convertToDatabaseColumn(E attribute) {
//        return attribute == null ? null : attribute.getValue();
//    }
//
//    @Override
//    public E convertToEntityAttribute(V dbData) {
//        return dbData == null ? null : ValueEnum.valueToEnum(clazz, dbData);
//    }
//}
