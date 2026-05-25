package co.istad.webdev.controller;

import co.istad.webdev.annotaionbean.Coffee;
import co.istad.webdev.config.CoffeeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class CoffeeController {

    private CoffeeConfig config;
    @Autowired
    public void setConfig(CoffeeConfig config){
        this.config = config;
    }


    @GetMapping("/api/coffees")
    public Map<String, Object> getBeans(){
        return Map.of("coffees",config.allBean());
    }
//
//        @GetMapping("/api/coffees")
//    public List< Object> getBeans(){
//        return List.of(config.allBean());
//    }

}
