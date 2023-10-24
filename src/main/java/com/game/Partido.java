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
    private List<TarejtaBase> tarjetas;

    public Partido(Equipo local, Equipo visitante, String name){
        this.local = local;
        this.visitante = visitante;
        this.name = name;
        this.tarjetas = new ArrayList<>();
    }

    public String getName() {
        return name + " " + local.getAbreviatura() + "x" + visitante.getAbreviatura();
    }
}
