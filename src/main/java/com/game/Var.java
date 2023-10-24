package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Var {
    private Partido partido;

    public Var(Partido partido){
        this.partido = partido;
    }

    public int cantidadTarjetasRojas(){
        List<Tarjeta> listaTarjetas = new ArrayList<>();
        Predicate<Tarjeta> buscarTarjeta = tarjeta -> tarjeta.getColor().equals("ROJA");
        listaTarjetas.addAll(partido.tarjetas.stream().filter(buscarTarjeta).collect(Collectors.toList()));
        return listaTarjetas.size();
    }

    public int cantidadTarjetasAmarillas(){
        List<Tarjeta> listaTarjetas = new ArrayList<>();
        Predicate<Tarjeta> buscarTarjeta = tarjeta -> tarjeta.getColor().equals("AMARILLA");
        listaTarjetas.addAll(partido.tarjetas.stream().filter(buscarTarjeta).collect(Collectors.toList()));
        return listaTarjetas.size();
    }
}
