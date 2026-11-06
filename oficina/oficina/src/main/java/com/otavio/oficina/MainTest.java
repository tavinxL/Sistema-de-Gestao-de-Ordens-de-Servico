package com.otavio.oficina;

import com.otavio.oficina.model.GerenciadorDeOrdens;
import com.otavio.oficina.model.OrdemDeServico;
import com.otavio.oficina.model.StatusOrdem;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeOrdens gerenciadorDeOrdens = new GerenciadorDeOrdens();
        int opcao;

        do {
            System.out.println("[1] - Adicionar Ordem");
            System.out.println("[2] - Listar Ordens");
            System.out.println("[3] - Sair");
            System.out.print("Escolha sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome Do Cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.println("Qual é o eletrônico/equipamento ?: ");
                    String equipamento = scanner.nextLine();
                    System.out.println("Qual a descrição ?: ");
                    String descricao = scanner.nextLine();
                    System.out.println("Qual é o valor ?: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    StatusOrdem statusOrdem = StatusOrdem.NAO_COMECADA;
                    LocalDate dataHoje = LocalDate.now();
                    System.out.println("Qual é a data de previsão do serviço ?: ");
                    int dataPrevista = scanner.nextInt();
                    scanner.nextLine();
                    LocalDate dataPrevisao = LocalDate.now().plusDays(dataPrevista);

                    OrdemDeServico ordemDeServico = new OrdemDeServico(cliente, equipamento, descricao, valor, statusOrdem, dataHoje, dataPrevisao);
                    gerenciadorDeOrdens.adicionarOrdem(ordemDeServico);
                    break;

                case 2:
                    System.out.println("===LISTANDO ORDENS DE SERVIÇO===");
                    gerenciadorDeOrdens.listarOrdens();
                    break;

                case 3:
                    System.out.println("Saindo do programa, até mais");
            }
        } while (opcao != 3);
    }
}

