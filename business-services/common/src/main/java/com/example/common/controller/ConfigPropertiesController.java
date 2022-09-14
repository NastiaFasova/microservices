package com.example.common.controller;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigPropertiesController {

    private final DynamicStringProperty propertyOneWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("baeldung.archaius.properties.one", "not found!");

    private final DynamicStringProperty propertyTwoWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("baeldung.archaius.properties.two", "not found!");

    private final DynamicStringProperty propertyThreeWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("baeldung.archaius.properties.three", "not found!");

    private final DynamicStringProperty propertyFourWithDynamic = DynamicPropertyFactory.getInstance()
            .getStringProperty("baeldung.archaius.properties.four", "not found!");

    @GetMapping("/properties-from-dynamic")
    public Map<String, String> getPropertiesFromDynamic() {
        Map<String, String> properties = new HashMap<>();
        properties.put(propertyOneWithDynamic.getName(), propertyOneWithDynamic.get());
        properties.put(propertyTwoWithDynamic.getName(), propertyTwoWithDynamic.get());
        properties.put(propertyThreeWithDynamic.getName(), propertyThreeWithDynamic.get());
        properties.put(propertyFourWithDynamic.getName(), propertyFourWithDynamic.get());
        return properties;
    }
}