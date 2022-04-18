package practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Bean
    @ConditionalOnBean(MyLibraryClassVariant.class)
    public InitExample initBean(){
        return new InitExample();
    }

    @Bean
    @ConditionalOnMissingBean(MissingBean.class)
    public OtherExampleClass defaultService(){
        return new OtherExampleClass();
    }

    @Bean
    @ConditionalOnBean(MissingBean.class)
    public AnotherExampleClass libraryService(){
        return new AnotherExampleClass();
    }

}
