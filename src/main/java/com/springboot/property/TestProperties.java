package com.springboot.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "test")
@ConfigurationPropertiesScan
public class TestProperties {

    private Bo bo = new Bo();

    private Account account = new Account();

    @Data
    public static class Bo{
        private String url;
    }

    @Data
    public static class Account{
        private String name;
    }
}
