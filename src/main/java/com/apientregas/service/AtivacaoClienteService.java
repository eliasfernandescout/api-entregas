package com.apientregas.service;

import com.apientregas.modelo.Cliente;
import com.apientregas.notificacao.Notificador;
import com.apientregas.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
   private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
    }
}
