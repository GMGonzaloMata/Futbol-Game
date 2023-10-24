package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Equipo {
    private String name;
    private String abreviatura;
    private List<IJugador> jugadores;

    public Equipo(String name, String abreviatura){
        this.name = name;
        this.abreviatura = abreviatura;
        this.jugadores = new ArrayList<>();
    }

    public void agregar(IJugador jugador){
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

    public IJugador obtenerJugador(int numero) {
        List<IJugador> listaJugadores = new ArrayList<>();
        Predicate<IJugador> buscarJugador = jugador -> jugador.getNumero() == numero;
        listaJugadores.addAll(jugadores.stream().filter(buscarJugador).collect(Collectors.toList()));
        return listaJugadores.get(0);
    }

    public String imprimirPlantel(){
        StringBuilder plantel = new StringBuilder();
        for (int i = 0; i < jugadores.size(); i++) {
            IJugador jugador = jugadores.get(i);
            if(jugador == obtenerJugador(19)){
                continue;
            }
            String jug = "[" + jugador.getNumero() + "] " + jugador.getName() + " (" + jugador.getPosicion() + ")";
            plantel.append(jug);
            if (i < jugadores.size()) {
            plantel.append(", ");
            }
        }for (int i = 0; i < jugadores.size(); i++) {
            IJugador jugador = jugadores.get(i);
            if(jugador == obtenerJugador(19)){
                 String jug = "[" + jugador.getNumero() + "] " + jugador.getName() + " (" + jugador.getPosicion() + ")";
                plantel.append(jug);
            }
        }
        return plantel.toString();
    }

    public List<IJugador> getJugadores() {
        return jugadores;
    }
}
