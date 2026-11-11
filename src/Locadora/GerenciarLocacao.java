package Locadora;

import java.util.LinkedList;

public class GerenciarLocacao {
    private LinkedList<Locacao> locacaos = new LinkedList<>();


    public void salvarLocacao(Locacao locacao){
        System.out.println("salvando locação");
        locacaos.add(locacao);
    }

    public void mostrarLocacoes(){
        if (locacaos.isEmpty()){
            System.out.println("Nenhuma locação realizada");
            return;
        }

        for (Locacao locacao : locacaos){
            locacao.dadosLocao();
        }
    }


}
