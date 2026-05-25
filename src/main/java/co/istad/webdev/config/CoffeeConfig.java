package co.istad.webdev.config;


import co.istad.webdev.annotaionbean.Coffee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Configuration
public class CoffeeConfig {

    @Bean
    public Coffee bean1(){
        return new Coffee(UUID.randomUUID().toString(),"Koko Coffee",1.25,true);
    }
    @Bean
    public Coffee bean2(){
        return new Coffee(UUID.randomUUID().toString(),"Kaka Coffee",1.25,false);
    }
    @Bean
    public Coffee bean3(){
        return new Coffee(UUID.randomUUID().toString(),"Kuku Coffee",1.25,true);
    }
    

    @Bean
    public List<Coffee> allBean() {
        return new ArrayList<>(List.of(bean1(),bean2(),bean3()));
    }


}
