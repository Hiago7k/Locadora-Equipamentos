package Locadora;

import java.util.Scanner;

public class main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***** Locadora Equipamentos *****");

        int opcao = -1;
        do {
            System.out.println("1 - Cadastrar Clientes");
            opcao = teclado.nextInt();

        }while (opcao != 0);
    }
}
