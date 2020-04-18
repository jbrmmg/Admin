package com.jbr.middletier.admin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="admin")
public class ApplicationProperties {
    private String serviceName;

    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public String getServiceName() { return this.serviceName; }
}
