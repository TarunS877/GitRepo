package com.example.BootReactStarter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class DemoRestController {

    @GetMapping(value = "greeting")
    public List<Map<String,Object>> greeting() {
        List<Map<String,Object>> items=new ArrayList<>();

        Map<String, Object> item1=new HashMap<>();
        item1.put("id",1);
        item1.put("name","Apples");
        item1.put("price","$2");
        items.add(item1);
        Map<String, Object> item2=new HashMap<>();
        item2.put("id",2);
        item2.put("name","Peaches");
        item2.put("price","$5");
        items.add(item2);
        return  items;
    }
}
