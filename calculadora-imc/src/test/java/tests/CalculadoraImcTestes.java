package tests;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calculadoraImc;

    @Test
    public void adultoBaixoPesoMuitoGrave() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }
}
