package practice;

import org.springframework.beans.factory.InitializingBean;

public class MyLibraryClassVariant implements MyLibraryInterface, InitializingBean {

    @Override
    public void printInfo(){
        System.out.println("My class from library variant");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printInfo();
    }
}
