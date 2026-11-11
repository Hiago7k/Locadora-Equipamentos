package Locadora;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Locacao {
    private static int idIncrementando = 0001;
    private int id;
    private boolean status;
    private int qtdItens;
    private double total;
    private OffsetDateTime dataAtual;

    private Cliente cliente;


    public Locacao() {
        idIncrementando++;
        this.id = idIncrementando;
        this.status = true;
        this.qtdItens = 0;
        this.total = 0;
        dataAtual = OffsetDateTime.now();
    }

    public void fazerLocacao(int idCliente) {
        if (!this.cliente.isSituacao()) {
            System.out.println("Cliente inátivo não pode abrir uma alocação");
            return;
        }
        System.out.println("Locação Aberta");
    }

    public void dadosLocao() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss XXX");
        dataAtual.format(formato);

        System.out.printf("Identificado %d | Status %b | Quantidade %d | total R$ %.2f | Hora %s",
                getId(), isStatus(), getQtdItens(), getTotal(), dataAtual
        );
    }


//    public OffsetDateTime getDataAtual() {
//        return dataAtual;
//    }

    public double getTotal() {
        return total;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public boolean isStatus() {
        return status;
    }

    public int getId() {
        return id;
    }
}
