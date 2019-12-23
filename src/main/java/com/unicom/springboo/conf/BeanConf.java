package com.unicom.springboo.conf;

import com.unicom.springboo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanbing
 * @create 2019-08-08 10:12
 */
@Configuration
public class BeanConf {

    @Bean/*("helloService")*/
    public HelloService createHelloService(){
        return new HelloService();
    }
}
