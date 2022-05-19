/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinaled;

/**
 *
 * @author Ibai
 */
public class Nomina implements INomina{

    @Override
    public int calculaNomina(Empleados e) {
        int nomina = e.getSueldo();
        
        return nomina;
    }

    @Override
    public void dameEmpleado(Empleados e) {
        System.out.println(e.getNombre()+" "+e.getDni()+" "+e.getTlf()+" "+e.getEdad());
    }

    @Override
    public int calculaNominaAnno(Empleados e) {
        int nomina = e.getSueldo();
        
        return nomina*12;
    }
    
}
