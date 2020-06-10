package com.john.swagger.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = SwaggerProperties.PREFIX,ignoreUnknownFields = false)
public class SwaggerProperties {

    public static final String PREFIX = "swagger.property";

    private String title;

    private String contactName;

    private String contactEmail;

    private String contateUrl;

    private String description;

    private String basePackage;

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContateUrl() {
        return contateUrl;
    }

    public void setContateUrl(String contateUrl) {
        this.contateUrl = contateUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }
}
