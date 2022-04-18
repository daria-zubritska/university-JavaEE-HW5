package practice;

import org.springframework.beans.factory.InitializingBean;

public class MyLibraryClass implements MyLibraryInterface, InitializingBean {

    @Override
    public void printInfo(){
        System.out.println("My class from library");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printInfo();
    }
}
