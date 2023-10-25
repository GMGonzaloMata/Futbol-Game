package com.game;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private int fecha;
    private String name;
    private Equipo local;
    private Equipo visitante;
    public List<Tarjeta> tarjetas;
    private Estadio estadio;
    private Arbitro arbitro;
    private List<Arbitro> arbitroLinea;
    private Arbitro arbitroAsistente;

    public Partido(Equipo local, Equipo visitante, String name){
        this.local = local;
        this.visitante = visitante;
        this.name = name;
        this.tarjetas = new ArrayList<>();
        this.arbitroLinea = new ArrayList<>();
    }

    public Partido(Estadio estadio, Equipo local, Equipo visitante, String name){
        this.local = local;
        this.visitante = visitante;
        this.name = name;
        this.estadio = estadio;
        this.tarjetas = new ArrayList<>();
        this.arbitroLinea = new ArrayList<>();
    }

    public String getName() {
        return name + " " + local.getAbreviatura() + "x" + visitante.getAbreviatura();
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void agregar(Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }

    public int tarjetasCantidad(){
        int cantidad = tarjetas.size();
        return cantidad;
    }
}
