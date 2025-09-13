package com.cadastro.usuario.Services;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getHello(String name){
        return "Hello, %s!".formatted(name);
    }
}
