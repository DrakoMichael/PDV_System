package com.drakomichael.models;

import java.util.List;

public class ItemModel {
    private static Integer number = 0;
    private Integer identificador;
    private String nome;

    public ItemModel(String nome, List<ItemModel> itemsList) {
        this.nome = nome;
        this.identificador = getIdentNum(itemsList);
    }

    private int getIdentNum(List<ItemModel> itemsList) {
        int num = 0;
        if (itemsList.isEmpty()) {
            return num;
        } else {
            num = itemsList.size();
        }
        return num;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public void exibirInformacoes() {
        System.out.println(this.identificador + " | " + this.nome);
    }

}
