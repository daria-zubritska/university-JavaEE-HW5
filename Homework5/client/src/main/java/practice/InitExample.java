package practice;

import org.springframework.beans.factory.InitializingBean;

public class InitExample implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitExample");
    }
}
