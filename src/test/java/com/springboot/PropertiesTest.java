package com.springboot;

import com.springboot.property.GlobalProperties;
import com.springboot.property.ServerProperties;
import com.springboot.property.TestProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertiesTest extends BaseTest {

    @Autowired
    private GlobalProperties globalProperties;

    @Autowired
    private ServerProperties serverProperties;

    @Autowired
    private TestProperties testProperties;

    @Test
    public void check() {
        System.out.println(globalProperties.getEmail());
        System.out.println(serverProperties.getEmail());
        System.out.println(testProperties.getAccount().getName());
    }

}
