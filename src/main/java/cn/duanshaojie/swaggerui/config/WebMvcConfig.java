package cn.duanshaojie.swaggerui.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <p><b>类名:</b> WebMvcConfig.java</p>
 * <p><b>标题:</b> 配置swagger</p>
 * <p>描述: </p>
 * <p>时间: 2018年10月31日 16点42分</p>
 * <p>
 * 桃之夭夭,灼灼其华
 * @author edison
 */
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
