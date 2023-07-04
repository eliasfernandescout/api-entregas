package com.apientregas.notificacao;

import com.apientregas.modelo.Cliente;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//@Repository
//@Component
public interface Notificador {
    void notificar(Cliente cliente, String mensagem);

}
