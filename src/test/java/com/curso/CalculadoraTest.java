package com.curso;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void suma5y8()
    {
        assertEquals( 13, Calculadora.suma(5,8) );
        
    }
    
    @Test
    public void suma5y0()
    {
        assertTrue( 5==Calculadora.suma(5,0) );
        
    }
    
    @Test
    public void resta4y1()
    {
        assertTrue( 3==Calculadora.resta(4,1) );
        
    }
}
