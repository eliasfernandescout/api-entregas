package com.apientregas.notificacao;

import com.apientregas.modelo.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atraves do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(),  mensagem);
    }
}