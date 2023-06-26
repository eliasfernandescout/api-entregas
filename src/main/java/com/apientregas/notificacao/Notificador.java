package com.apientregas.notificacao;

import com.apientregas.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);

}
