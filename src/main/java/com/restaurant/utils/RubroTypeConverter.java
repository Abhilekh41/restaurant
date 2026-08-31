package com.restaurant.utils;

import com.restaurant.dataObjects.RubroType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class RubroTypeConverter implements AttributeConverter<RubroType, String> {

    @Override
    public String convertToDatabaseColumn(RubroType attribute) {
        if (attribute == null) {
            return null;
        }

        return attribute.name().toLowerCase();
    }

    @Override
    public RubroType convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }

        return RubroType.valueOf(dbData.toUpperCase());
    }
}