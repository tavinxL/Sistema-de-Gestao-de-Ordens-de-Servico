package com.otavio.oficina.model;

public enum StatusOrdem {
    CONCLUIDO("Concluído"),
    EM_ANDAMENTO("Em andamento"),
    NAO_COMECADA("Não começamos o serviço");

    private String descricao;

    StatusOrdem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
