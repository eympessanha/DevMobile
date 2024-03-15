package tests;

import control.Calculadora;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTestes {

    Calculadora calc;

    @Before // condição inicial de cada método
    public void setup() {
        calc = new Calculadora();
    }

    @After // condição final de cada método
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testeSomar() {
        Assert.assertEquals(5.0, calc.somar(3.0, 2.0), 0.0);
    }

    @Test
    public void testeSubtrair() {
        Assert.assertEquals(5.0, calc.subtrair(10.0, 5.0), 0.0);
    }

    @Test
    public void testeMultiplicar() {
        Assert.assertEquals(4.0, calc.multiplicar(2.0, 2.0), 0.0);
    }

    @Test
    public void testeDividir() {
        Assert.assertEquals(5.0, calc.dividir(25.0, 5.0), 0.0);
    }
}
