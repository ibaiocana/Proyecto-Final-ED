/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofinaled;

/**
 *
 * @author Ibai
 */
public class ProyectoFinalED {

    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        
        nomina.dameEmpleado(e);
        System.out.println("Empleado sueldo: "+nomina.calculaNomina(e));
        System.out.println("Empleado sueldo anual: "+nomina.calculaNominaAnno(e));
    }
}
