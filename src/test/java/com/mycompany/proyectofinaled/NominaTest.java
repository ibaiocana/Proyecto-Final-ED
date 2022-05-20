/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyectofinaled;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ibai
 */
public class NominaTest {
    
    public NominaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of calculaNomina method, of class Nomina.
     */
    @org.junit.jupiter.api.Test
    public void testCalculaNomina() {
        System.out.println("calculaNomina");
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        Nomina instance = new Nomina();
        int expResult = 1200;
        int result = instance.calculaNomina(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of dameEmpleado method, of class Nomina.
     */
    @org.junit.jupiter.api.Test
    public void testDameEmpleado() {
        System.out.println("dameEmpleado");
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        Nomina instance = new Nomina();
        instance.dameEmpleado(e);
    }

    /**
     * Test of calculaNominaAnno method, of class Nomina.
     */
    @org.junit.jupiter.api.Test
    public void testCalculaNominaAnno() {
        System.out.println("calculaNominaAnno");
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        Nomina instance = new Nomina();
        int expResult = 1200*12;
        int result = instance.calculaNominaAnno(e);
        assertEquals(expResult, result);
    }
    
}
