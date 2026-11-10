package Locadora;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        GerenciarClientes gerenciar = new GerenciarClientes();
        GerenciarEquipamentos gerenciarEp = new GerenciarEquipamentos();

        System.out.println("***** Locadora Equipamentos *****");


        int opcao = -1;
        do {
            System.out.println();
            System.out.println("--------------------------");
            System.out.println("1 - Cadastrar Clientes");
            System.out.println("2 - Listar Clientes cadastrados");
            System.out.println("3 - Cadastrar Equipamentos");
            System.out.println("4 - Listar Equipamentos Disponíveis");
            //    System.out.println("5 - Listar Equipamentos Indisponíveis");


            System.out.println("Escolha uma opção");
            opcao = teclado.nextInt();

            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente");
                    String nome = teclado.nextLine();

                    if (nome.isBlank() || nome.isEmpty()) {
                        System.out.println("Nome não pode ser vazio");
                        break;
                    }

                    Cliente cliente = new Cliente(nome);
                    gerenciar.salvarCliente(cliente);
                    System.out.println("Cliente cadastrado!");

                    break;
                case 2:

                    gerenciar.exibirClientes();
                    break;
                case 3:
                    // logica
                    System.out.println("Digite o nome do equipamento");
                    String nomeEquipamento = teclado.nextLine();

                    if (nomeEquipamento.isEmpty()) {
                        System.out.println("Nome não pode ser vazio");
                        break;
                    }

                    System.out.println("Digite o valor da Diária");
                    double diariaEquipamento = teclado.nextDouble();

                    if (diariaEquipamento <= 0) {
                        System.out.println("Valor diária deve ser maior que zero");
                        break;
                    }

                    System.out.println("Digite a quantidade em estoque");
                    int estoqueEquipamento = teclado.nextInt();

                    if (estoqueEquipamento <= 0) {
                        System.out.println("Estoque deve ser maior que 0");
                        break;
                    }

                    Equipamento equipamento = new Equipamento(nomeEquipamento, diariaEquipamento, estoqueEquipamento);
                    gerenciarEp.salvarEqupamento(equipamento);
                    break;

                case 4:
                    gerenciarEp.exibirEquipamentos();
                    break;
            }


        } while (opcao != 0);
    }
}
