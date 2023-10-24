package com.game;

public class Estadio implements IImprimible{
    private String name;
    private String ciudad;
    private String pais;

    public Estadio(String name,String ciudad, String pais){
        this.name = name;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getName() {
        return name;
    }

    public String getPais() {
        return pais;
    }

    public String toString(){
        return name + ", " + ciudad + " (" + pais + ")";
    }

    public String impresion(){
        return "[Estadio] " + getName() + " (" + getCiudad() + " - " + getPais() + ")";
}
}
