package com.darrius.austin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.TimeZone;

/**
 * @author Darrius
 */
@RefreshScope
@MapperScan("com.darrius.austin.database.*.mapper")
@SpringBootApplication
public class AustinApplication {
    public static final String TIMEZONE_GMT = "GMT";

    public static void main(String[] args) {
        SpringApplication.run(AustinApplication.class, args);
    }

    static {
        TimeZone.setDefault(TimeZone.getTimeZone(TIMEZONE_GMT));
        System.getProperties().setProperty("file.encoding", "UTF-8");
    }
}
