package com.apientregas.service;

import com.apientregas.modelo.Cliente;
import com.apientregas.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {


    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        if(notificador != null){
            notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
        }else{
            System.out.println("Nao existe notificador, mas cliente foi ativado");
        }
    }
}
