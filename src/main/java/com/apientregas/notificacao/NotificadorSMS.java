package com.apientregas.notificacao;

import com.apientregas.modelo.Cliente;

public class NotificadorSMS {

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s por SMS atraves do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}