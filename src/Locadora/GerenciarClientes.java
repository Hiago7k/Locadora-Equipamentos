package Locadora;

import java.util.LinkedList;

public class GerenciarClientes {
    private LinkedList<Cliente> clientes = new LinkedList<>();

    public void salvarCliente(Cliente cliente) {
        System.out.println("Cliente foi salvo!");
        clientes.add(cliente);
    }

    public boolean exibirClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado no sistema!");
            return false;
        }

        System.out.println("----- Clientes cadastrados no sistema -----");
        for (Cliente cliente : clientes) {
            cliente.dadosCliente();
        }

        return true;
    }

}
