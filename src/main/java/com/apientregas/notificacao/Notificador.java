package com.apientregas.notificacao;

import modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);

}
