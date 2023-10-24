package com.game;

public class Jugador implements IJugador {
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
}
