package com.apientregas.notificacao;

import com.apientregas.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS {

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s por SMS atraves do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
