package com.sinapse.gerenciador.leitura.model;

public enum StatusLeitura {
    SUCCESS,            // Leitura realizada com sucesso
    TIMEOUT,            // Tempo de resposta excedido
    INVALID_VALUE,      // Valor inválido (fora de range, NaN, null, etc)
    OUT_OF_RANGE,       // Valor fora dos limites aceitáveis (ex: -999 ou 9999)
    PROCESSING_ERROR,   // Erro ao processar a leitura
    STORAGE_ERROR,      // Erro ao salvar no banco
    SENT,               // Enviado com sucesso para API
    SEND_ERROR
}
