package org.lessons.java.shop;

public class Categoria {
    private String nomeCaregoria;
    private String descCategoria;

    public Categoria (String nomeCaregoria, String descCategoria){
        this.nomeCaregoria = nomeCaregoria;
        this.descCategoria = descCategoria;
    }

    public String getNomeCaregoria() {
        return nomeCaregoria;
    }

    public void setNomeCaregoria(String nomeCaregoria) {
        this.nomeCaregoria = nomeCaregoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

}

