package com.game;

public class TarejetaBase {
    private Jugador jugador;
    private String color;

    public TarejetaBase(String color, Jugador jugador){
        this.color = color;
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public Jugador getJugador() {
        return jugador;
    }
}
