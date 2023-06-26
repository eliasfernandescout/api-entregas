package com.apientregas;

import com.apientregas.modelo.Cliente;
import com.apientregas.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    private AtivacaoClienteService  ativacaoClienteService;

    public ApiController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente elias = new Cliente("Elias Fernandes", "elias.fernandes@gmail.com", "41995296747");
        ativacaoClienteService.ativar(elias);
        return "Hello!";
    }


}
