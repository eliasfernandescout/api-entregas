package com.apientregas.service;

import com.apientregas.modelo.Cliente;
import com.apientregas.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {
    @Autowired
    private List<Notificador> notificadores;

//    @Autowired
//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
//        notificadores.notificar(cliente, "Seu cadastro no sistema esta ativo!");

        for (int i = 0; i < notificadores.size(); i++) {
            notificadores.get(i).notificar(cliente, "Seu cadastro esta ativo no sistema!");


        }

    }

}
