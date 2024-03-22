package tests;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calculadoraImc;

    // mudar pra setup
    // idosO

    @Test
    public void idosoBaixoPeso() { //FOI
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.73, 65.0, 66,"masculino"));
    }

    @Test
    public void idosoPesoNormal1() { //FOI
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.69, 63.0, 67,"masculino"));
    }

    @Test
    public void idosoPesoNormal2() { // FOI
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.68, 76.0, 70,"masculino"));
    }

    @Test
    public void idosoSobrepeso1() { // FOI
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.68, 77.0, 81,"masculino"));
    }

    @Test
    public void idosoSobrepeso2() { // FOI
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.70, 86.0, 63,"masculino"));
    }

    @Test
    public void idosoObesidadeI1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void idosoObesidadeI2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void idosoObesidadeII1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void idosoObesidadeII2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void idosoObesidadeIII() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

      // idosA

      @Test
      public void idosaBaixoPeso() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaPesoNormal1() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaPesoNormal2() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaSobrepeso1() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaSobrepeso2() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaObesidadeI1() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaObesidadeI2() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaObesidadeII1() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaObesidadeII2() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

      @Test
      public void idosaObesidadeIII() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
      }

    // adulto
    @Test
    public void adultoBaixoPesoMuitoGrave() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // mudar parametros do assert
    @Test
    public void adultoBaixoPesoGrave1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoBaixoPesoGrave2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoBaixoPeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoBaixoPeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoObesidadeI1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade I", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoObesidadeI2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade I", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoObesidadeII1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade II", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoObesidadeII2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade II", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoObesidadeIII() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }
}
