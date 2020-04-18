package com.jbr.middletier.admin;

import com.jbr.middletier.admin.config.ApplicationProperties;
import com.jbr.middletier.admin.config.DefaultProfileUtil;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableAdminServer
@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class MiddleTier {
    private static final Logger log = LoggerFactory.getLogger(MiddleTier.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MiddleTier.class);
        DefaultProfileUtil.addDefaultProfile(app);
        app.run(args);
    }
}

