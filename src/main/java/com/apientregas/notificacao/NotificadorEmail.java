package com.apientregas.notificacao;

import com.apientregas.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class NotificadorEmail implements Notificador {
   @Value("${notificador.email.host-servidor}")
    private String host;
    @Value("${notificador.email.porta-servidor}")
    private Integer porta;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("HOST: " + host);
        System.out.println("PORTA: " + porta);


        System.out.printf("Notificando %s atraves do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(),  mensagem);
    }
}