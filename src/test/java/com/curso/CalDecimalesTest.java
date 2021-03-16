package com.curso;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalDecimalesTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void suma5y8()
    {
        assertEquals( 13.2, Calculadora.suma(5.1,8.1),0.001 );
        
    }
    
    @Test
    public void suma5y0()
    {
        assertTrue( 5.3==Calculadora.suma(5,0.3) );
        
    }
    
    @Test
    public void resta4y1()
    {
        assertTrue( 2.9==Calculadora.resta(4,1.1) );
        
    }
}
