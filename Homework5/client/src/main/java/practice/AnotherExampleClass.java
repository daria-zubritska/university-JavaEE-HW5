package practice;

import org.springframework.beans.factory.InitializingBean;

public class AnotherExampleClass implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am an another bean");
    }
}
