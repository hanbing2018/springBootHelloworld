package com.unicom.springboo;

import com.unicom.springboo.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHelloworldApplicationTests {

    @Autowired
    private Person p;

    @Autowired
    ApplicationContext ac;

    @Test
    public void contextLoads() {
        System.out.println(p);
    }

    @Test
    public void test2(){
        System.out.println(ac.containsBean("createHelloService"));
    }

}
