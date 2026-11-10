package Locadora;

import java.util.LinkedList;

public class GerenciarEquipamentos {
    private LinkedList<Equipamento> equipamentos = new LinkedList<>();


    public void salvarEqupamento(Equipamento equipamento){
        equipamentos.add(equipamento);
        System.out.println("Equipamento foi salvo no sistema");
    }

    public void exibirEquipamentos(){
        if (equipamentos.isEmpty()){
            System.out.println("Não existe nenhum equipamento registrado!");
            return;
        }

        System.out.println("---- Listando todos os equipamentos ----");
        for (Equipamento equipamento : equipamentos){
            equipamento.dadosEquipamento();
        }
    }

}
