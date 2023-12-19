package com.springboot.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@Data
@ConfigurationProperties(prefix = "server")
@ConfigurationPropertiesScan
public class ServerProperties {

    private String email;

    private List<Cluster> clusterList = Collections.emptyList();

    private Datasource datasource = new Datasource();

    @Data
    public static class Cluster{
        private String ip;
        private String path;
    }

    @Data
    public static class Datasource{
        private String url;
        private String username;
        private String password;
    }
}
