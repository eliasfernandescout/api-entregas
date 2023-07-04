package com.apientregas.notificacao;

import com.apientregas.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {
    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("Notificador Email");

    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(this.caixaAlta == true){
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s atraves do e-mail %s usando SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}