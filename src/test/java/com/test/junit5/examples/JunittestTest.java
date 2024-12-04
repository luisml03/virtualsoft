/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.test.junit5.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
/**
 *
 * @author lmartinez
 */
public class JunittestTest {

    @Test
    void testNombreCuenta() {
        Junittest junittest = new Junittest();
        junittest.setPersona("luis");
        String esperad = "luis";
        String real = junittest.getPersona();

        assertEquals(esperad, real);
    
    }

}