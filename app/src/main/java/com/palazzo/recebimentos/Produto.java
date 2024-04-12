package com.palazzo.recebimentos;

public class Produto {

    private String name;
    private int lote;
    private int qtd;

    public Produto(String name, int lote, int qtd) {
        this.name = name;
        this.lote = lote;
        this.qtd = qtd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
