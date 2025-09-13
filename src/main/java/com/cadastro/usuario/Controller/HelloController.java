package com.cadastro.usuario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.usuario.Services.HelloService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    
    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return helloService.getHello(name);
    }
}
