/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasgm123.tpdos.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Plan {
    public Integer idPlan;
    public String nomPlan;
    public Integer anioinicio;
    public Carrera carrera;
    public List<Materia> materias;

    // Constructor de Plan
    public Plan(Integer idPlan, String nomPlan, Integer anioinicio, Carrera carrera) {
        this.materias = new ArrayList<>();
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioinicio = anioinicio;
        this.carrera = carrera;
    }
}
