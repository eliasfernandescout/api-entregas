package com.apientregas.service;

import com.apientregas.modelo.Cliente;
import com.apientregas.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
   private NotificadorEmail notificador;
    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
    }
}
