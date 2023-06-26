package com.apientregas.service;

import com.apientregas.modelo.Cliente;
import com.apientregas.modelo.Produto;
import com.apientregas.notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService {
 private NotificadorSMS notificador;

    public void emitir(Cliente cliente, Produto produto) {
        // TODO emite a nota fiscal aqui;
        // INFORMAR AO CLIENTE QUE A NOTA FISCAL FOI EMITIDA

        notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida.");

    }


}

