package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Var {
    private Partido partido;
    private AsistenteDeVideo asistenteDeVideo;
    private List<AVAR> aVar;

    public Var(Partido partido){
        this.partido = partido;
        this.aVar = new ArrayList<>();
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

    public int cantidadTarjetas(Equipo equipo){
        List<Tarjeta> listaTarjetas = new ArrayList<>();
        Predicate<Tarjeta> buscarTarjeta = tarjeta -> equipo.getJugadores().contains(tarjeta.getJugador());
        listaTarjetas.addAll(partido.getTarjetas().stream().filter(buscarTarjeta).collect(Collectors.toList()));
        return listaTarjetas.size();
    }
}