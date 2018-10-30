package com.shiyian.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: jzhang
 * @Date: 2018/10/15 13:33
 * @Description: 根当前应用相关的配置
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/bg","/bg/user/login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //文件磁盘图片url 映射
        //配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径
        registry.addResourceHandler("/article/**").addResourceLocations("file:///D:/image/article/");
    }
}
