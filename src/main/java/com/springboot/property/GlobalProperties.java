package com.springboot.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties // no prefix, find root level values.
@ConfigurationPropertiesScan
public class GlobalProperties {

    private int threadPool;
    private String email;
}
