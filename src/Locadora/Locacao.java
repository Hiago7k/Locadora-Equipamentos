package Locadora;

import java.time.OffsetDateTime;

public class Locacao {
    private static int idIncrementando = 0001;
    private int id;
    private boolean status;
    private int qtdItens;
    private double total;
    private OffsetDateTime dataAtual;
}
