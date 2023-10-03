package com.example.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 湛蓝之翼
 * @version 1.0
 * @description 配置类
 * @date 2023/10/3 16:34
 */
@Configuration
public class configurerAdapter implements WebMvcConfigurer {
    /**
     * 配置跨域
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //配置对那些请求路径进行跨域处理
        registry
                .addMapping("/**")
                //允许的请求头
                .allowedHeaders("*")
                //允许的方法(get,post等)
                .allowedMethods("*")
                //探测请求有效时间
                .maxAge(1800)
                //是否允许证书(cookie之类)
                .allowCredentials(true)
                // 支持的域
                .allowedOriginPatterns("*");
    }
}
