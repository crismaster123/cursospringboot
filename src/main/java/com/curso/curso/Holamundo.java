package com.curso.curso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holamundo {
    @RequestMapping("/")
    public String strHola(){
        return "hola mundo!";
    }

}
