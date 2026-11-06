package com.otavio.oficina.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ordem_servico")
public class OrdemDeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Mudamos para Long para alinhar com o padrão do JPA

    private String cliente;
    private String equipamento;
    private double valor;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusOrdem status;

    private LocalDate dataAbertura;
    private LocalDate dataPrevisao;

    // O JPA exige um construtor vazio sem parâmetros!
    public OrdemDeServico() {}

    public OrdemDeServico(String cliente, String equipamento, String descricao, double valor, StatusOrdem status, LocalDate dataAbertura, LocalDate dataPrevisao) {
        this.cliente = cliente;
        this.equipamento = equipamento;
        if (valor < 0) {
            throw new IllegalStateException("O valor não pode ser negativo");
        }
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
        if (dataPrevisao.isBefore(dataAbertura)) {
            throw new IllegalStateException("A data de abertura não pode ser anterior a data de previsão");
        }
        this.dataAbertura = dataAbertura;
        this.dataPrevisao = dataPrevisao;
    }

    public void setStatus(StatusOrdem status) {
        if (this.status == StatusOrdem.CONCLUIDO) {
            return;
        }
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append("\n");
        sb.append("Nome Cliente: ").append(cliente).append("\n");
        sb.append("Equipamento: ").append(equipamento).append("\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Valor: ").append(valor).append("\n");
        sb.append("Status do serviço: ").append(status).append("\n");
        sb.append("Data de abertura: ").append(dataAbertura).append("\n");
        sb.append("Data de previsão: ").append(dataPrevisao).append("\n");

        return sb.toString();
    }

    // Adicione os Getters e Setters aqui
}
