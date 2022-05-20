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
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        Nomina nomina = new Nomina(e);
        
        nomina.dameEmpleado(e);
        System.out.println("Empleado sueldo: "+nomina.calculaNomina(e));
        System.out.println("Empleado sueldo anual: "+nomina.calculaNominaAnno(e));
        
        Empleados a = new Empleados("pepe", 633223038, 20, "76627344R", 1500);
        nomina = new Nomina(a);
        
        nomina.dameEmpleado(a);
        System.out.println("Empleado sueldo: "+nomina.calculaNomina(a));
        System.out.println("Empleado sueldo anual: "+nomina.calculaNominaAnno(a));
    }
}
