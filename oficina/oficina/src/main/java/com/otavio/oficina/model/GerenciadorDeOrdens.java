package com.otavio.oficina.model;
import com.otavio.oficina.model.OrdemDeServico;

public class GerenciadorDeOrdens {
    private OrdemDeServico[] listarDeOrdens;
    private int quantidadeAtual;

    public GerenciadorDeOrdens() {
        this.listarDeOrdens = new OrdemDeServico[50];
        this.quantidadeAtual = 0;
    }

    public void adicionarOrdem(OrdemDeServico novaOrdem) {
        if (quantidadeAtual < listarDeOrdens.length) {
            listarDeOrdens[quantidadeAtual] = novaOrdem;
            quantidadeAtual++;
            System.out.println("Ordem cadastrada com sucesso!");
        } else {
            System.out.println("Erro: Limite de ordens atingido.");
        }
    }

    public void listarOrdens() {
        if (quantidadeAtual == 0) {
            System.out.println("Listar de ordens vazia");
        } else {
            for (int i = 0; i < quantidadeAtual; i++) {
                System.out.println(listarDeOrdens[i]);
            }
        }
    }
}
