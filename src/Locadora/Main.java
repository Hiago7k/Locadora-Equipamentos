package Locadora;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        GerenciarClientes gerenciar = new GerenciarClientes();


        System.out.println("***** Locadora Equipamentos *****");


        int opcao = -1;
        do {
            System.out.println();
            System.out.println("--------------------------");
            System.out.println("1 - Cadastrar Clientes");
            System.out.println("2 - Listar Clientes cadastrados");
            System.out.println("Escolha uma opção");
            opcao = teclado.nextInt();

            teclado.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do cliente");
                    String nome = teclado.nextLine();
                    if (nome.isBlank() || nome.isEmpty()){
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
            }


        }while (opcao != 0);
    }
}
