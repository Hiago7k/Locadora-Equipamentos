package Locadora;

public class Cliente {
    private int id;
    private String nome;
    private boolean situacao;
    private static int clientesCriados = 0;

    public Cliente(String nome) {
        this.nome = nome;
        this.situacao = true;
        clientesCriados++;
        this.id = clientesCriados;
    }

    public void dadosCliente() {
        System.out.printf("ID: %d | Nome: %s | Situação %b %n", getId(), getNome(), isSituacao());
    }

    public int getId() {
        return id;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getNome() {
        return nome;
    }
}
