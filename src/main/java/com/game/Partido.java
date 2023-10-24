package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Partido {
    private int fecha;
    private String name;
    private Equipo local;
    private Equipo visitante;
    private List<TarejetaBase> tarjetas;

    public Partido(Equipo local, Equipo visitante, String name){
        this.local = local;
        this.visitante = visitante;
        this.name = name;
        this.tarjetas = new ArrayList<>();
    }

    public String getName() {
        return name + " " + local.getAbreviatura() + "x" + visitante.getAbreviatura();
    }

    public List<TarejetaBase> getTarjetas() {
        return tarjetas;
    }

    public void agregar(TarejetaBase tarjeta){
        tarjetas.add(tarjeta);
    }

    public int tarjetasCantidad(){
        int cantidad = tarjetas.size();
        return cantidad;
    }
}
