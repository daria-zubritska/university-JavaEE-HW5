package practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    @ConditionalOnProperty(prefix = "custom", name = "property", havingValue = "email")
    MyLibraryInterface myLibraryClass(){
        return new MyLibraryClassVariant();
    }

    @Bean
    @ConditionalOnProperty(prefix = "library", name = "service", havingValue = "true")
    MissingBean missingBean(){
        return new MissingBean();
    }
}
