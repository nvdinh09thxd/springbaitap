package edu.vinaenter.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScans({@ComponentScan(value = "edu.vinaenter.*")})
public class ApplicationContextConfig {

	@Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver views = new InternalResourceViewResolver();
        views.setPrefix("/WEB-INF/views/");
        views.setSuffix(".jsp");
        return views;
    }
}
