package com.devhub.apientregas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Ola Mundo!";
    }

    @GetMapping("/teste")
    @ResponseBody
    public String teste(){
        return "Teste de rebuild do soft";
    }
}
