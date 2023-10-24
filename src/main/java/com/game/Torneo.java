package com.game;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private String name;
    private Equipo ganador;
    private List<Partido> partidos;
    private List<Equipo> equipos; 

    public Torneo(String name){
        this.name = name;
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void agregar(Equipo team){
        equipos.add(team);
    }

    public void agregar(Partido game){
        partidos.add(game);
    }

    public int equiposCantidad(){
        int cantidad = equipos.size();
        return cantidad;
    }

    public int partidosCantidad(){
        int cantidad = partidos.size();
        return cantidad;
    }
}
