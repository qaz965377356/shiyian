package com.shiyian.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: jzhang
 * @Date: 2018/10/24 09:11
 * @Description: 文件上传的默认配置
 */
@Component
@Data
@ConfigurationProperties(prefix = "system")
public class AppConfig {
    public String filepath;
    public String urlpath;

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getUrlpath() {
        return urlpath;
    }

    public void setUrlpath(String urlpath) {
        this.urlpath = urlpath;
    }
}
