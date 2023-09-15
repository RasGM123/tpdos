/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasgm123.tpdos.modelos;

import java.util.ArrayList;
import java.util.List;


public class Carrera {
    public Integer idCarrera;
    public String nomCarrera;
    public List<Plan> planes;

    // Constructor de Carrera
    public Carrera(Integer idCarrera, String nomCarrera) {
        this.planes = new ArrayList<>();
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
    }
}
