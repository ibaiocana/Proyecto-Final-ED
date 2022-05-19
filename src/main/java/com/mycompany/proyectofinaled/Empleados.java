
package com.mycompany.proyectofinaled;

public class Empleados {
    private String nombre;
    private int tlf;
    private int edad;
    private String dni;
    private int sueldo;

    public Empleados(String nombre, int tlf, int edad, String dni, int sueldo) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.edad = edad;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
}
