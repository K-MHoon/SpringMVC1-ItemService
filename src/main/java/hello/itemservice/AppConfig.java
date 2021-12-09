package hello.itemservice;

import hello.itemservice.util.YmlMessageSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Slf4j
public class AppConfig {

//    @Bean
//    public MessageSource messageSource() {
//        YmlMessageSource messageSource = new YmlMessageSource();
//        messageSource.setDefaultEncoding("utf-8");
//        messageSource.setBasenames("messages", "errors");
//        for (String s : messageSource.getBasenameSet()) {
//            log.info("messageSource = {}", s);
//        }
//
//        return messageSource;
//    }
}
