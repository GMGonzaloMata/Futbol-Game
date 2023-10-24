package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Equipo {
    private String name;
    private String abreviatura;
    private List<Jugador> jugadores;

    public Equipo(String name, String abreviatura){
        this.name = name;
        this.abreviatura = abreviatura;
        this.jugadores = new ArrayList<>();
    }

    public void agregar(Jugador jugador){
        jugadores.add(jugador);
    }

    public int jugadoresCantidad(){
        int cantidad = jugadores.size();
        return cantidad;
    }

    public String getName() {
        return name;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public Jugador obtenerJugador(int numero) {
        List<Jugador> listaJugadores = new ArrayList<>();
        Predicate<Jugador> buscarJugador = jugador -> jugador.getNumero() == numero;
        listaJugadores.addAll(jugadores.stream().filter(buscarJugador).collect(Collectors.toList()));
        return listaJugadores.get(0);
    }
}
