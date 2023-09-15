/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rasgm123.tpdos;
import com.rasgm123.tpdos.modelos.Carrera;
import com.rasgm123.tpdos.modelos.Plan;
import com.rasgm123.tpdos.modelos.Materia;


public class Tpdos {

    public static void main(String[] args) {
        // Crear dos carreras
        Carrera carrera1 = new Carrera(1, "Ingenieria en Informatica");
        Carrera carrera2 = new Carrera(2, "Otra Carrera");

        // Crear cuatro materias
        Materia materia1 = new Materia(1, "Materia 1", 1);
        Materia materia2 = new Materia(2, "Materia 2", 1);
        Materia materia3 = new Materia(3, "Materia 3", 2);
        Materia materia4 = new Materia(4, "Materia 4", 2);

        // Crear cuatro planes
        Plan plan1 = new Plan(1, "Plan 1", 2023, carrera1);
        plan1.materias.add(materia1);

        Plan plan2 = new Plan(2, "Plan 2", 2023, carrera1);
        plan2.materias.add(materia2);

        Plan plan3 = new Plan(3, "Plan 3", 2023, carrera1);
        plan3.materias.add(materia3);

        Plan plan4 = new Plan(4, "Plan 4", 2023, carrera2);
        plan4.materias.add(materia4);

        // Agregar los planes a la lista de planes de las carreras
        carrera1.planes.add(plan1);
        carrera1.planes.add(plan2);
        carrera1.planes.add(plan3);
        carrera2.planes.add(plan4);

        // Imprimir la información de la carrera "Ingenieria en Informatica" con el formato especificado
        System.out.println(carrera1.nomCarrera);
        for (Plan p : carrera1.planes) {
            System.out.println(p.nomPlan);
            int orden = 1;
            for (Materia m : p.materias) {
                System.out.println(orden + ", " + m.nomMat + ", " + m.anioCursado + ".");
                orden++;
            }
        }   
    }
}


