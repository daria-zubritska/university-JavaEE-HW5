package practice;

import org.springframework.beans.factory.InitializingBean;

public class MissingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am a missing bean");
    }
}
