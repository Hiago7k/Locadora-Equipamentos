package Locadora;

public class Equipamento {
    private int cod;
    private String nome;
    private double diaria;
    private int estoque;
    private static int incrementoCod = 100;

    public Equipamento(String nome, double diaria, int estoque) {
        incrementoCod++;
        this.cod = incrementoCod;
        this.nome = nome;
        this.diaria = diaria;
        this.estoque = estoque;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getDiaria() {
        return diaria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void dadosEquipamento() {
        System.out.printf("Código: %d | Nome: %s | Diária R$ %.2f | Estoque %d%n",
                getCod(), getNome(), getDiaria(), getEstoque());
    }
}
