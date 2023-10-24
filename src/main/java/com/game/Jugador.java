package com.game;

public class Jugador implements IJugador, IImprimible {
    private String posicion;
    public String name;
    public int numero;
    
    public Jugador(String name, int numero){
        this.name = name;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public String impresion(){
        return "[Jugador " + getNumero() + "] " + getName() + " > " + getPosicion();
    }
}
