package practice;

import org.springframework.beans.factory.InitializingBean;

public class JustSomeSample implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hi i am something");
    }
}
