package hello.itemservice;

import hello.itemservice.util.YmlMessageSource;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    public MessageSource messageSource() {
        YmlMessageSource messageSource = new YmlMessageSource();
        messageSource.setDefaultEncoding("utf-8");
        messageSource.setBasenames("messages", "errors");
        return messageSource;
    }
}
