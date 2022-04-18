package practice;

import org.springframework.beans.factory.InitializingBean;

public class OtherExampleClass implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am an other bean");
    }
}
