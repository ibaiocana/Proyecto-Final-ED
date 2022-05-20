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
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculaNomina method, of class Nomina.
     */
    @Test
    public void testCalculaNomina() {
        System.out.println("calculaNomina");
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        Nomina instance = new Nomina(e);
        int expResult = 1200;
        int result = instance.calculaNomina(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of dameEmpleado method, of class Nomina.
     */
    @Test
    public void testDameEmpleado() {
        System.out.println("dameEmpleado");
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        Nomina instance = new Nomina(e);
        instance.dameEmpleado(e);
    }

    /**
     * Test of calculaNominaAnno method, of class Nomina.
     */
    @Test
    public void testCalculaNominaAnno() {
        System.out.println("calculaNominaAnno");
        Empleados e = new Empleados("ibai", 633245038, 20, "76627788R", 1200);
        Nomina instance = new Nomina(e);
        int expResult = 1200*12;
        int result = instance.calculaNominaAnno(e);
        assertEquals(expResult, result);
    }

    
}
