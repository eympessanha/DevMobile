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
    public void idosoSobrepeso2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.70, 86.0, 63,"masculino"));
    }

    @Test
    public void idosoObesidadeI1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.70, 88.0, 68,"masculino"));
    }

    @Test
    public void idosoObesidadeI2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.61, 90.0, 70,"masculino"));
    }

    @Test
    public void idosoObesidadeII1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.72, 104.0, 65,"masculino"));
    }

    @Test
    public void idosoObesidadeII2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.72, 115.0, 69,"masculino"));
    }

    @Test
    public void idosoObesidadeIII() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.71, 117.0, 68,"masculino"));
    }

      // idosA

      @Test
      public void idosaBaixoPeso() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.67, 61.0, 69,"feminino"));
      }

      @Test
      public void idosaPesoNormal1() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.70, 64.0, 80,"feminino"));
      }

      @Test
      public void idosaPesoNormal2() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.60, 69.0, 74,"feminino"));
      }

      @Test
      public void idosaSobrepeso1() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.62, 71.0, 70,"feminino"));
      }

      @Test
      public void idosaSobrepeso2() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.65, 87.0, 91,"feminino"));
      }

      @Test
      public void idosaObesidadeI1() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.59, 81.0, 88,"feminino"));
      }

      @Test
      public void idosaObesidadeI2() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.62, 97.0, 70,"feminino"));
      }

      @Test
      public void idosaObesidadeII1() {
          calculadoraImc = new CalculadoraImc();
          Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.60, 95.0, 77,"feminino"));
      }

      @Test
      public void idosaObesidadeII2() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.60, 107.0, 65,"feminino"));
      }

      @Test
      public void idosaObesidadeIII() {
          calculadoraImc = new CalculadoraImc(); // mudar pra setup
          Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(1.57, 104.0, 88,"feminino"));
      }

    // adulto
    @Test
    public void adultoBaixoPesoMuitoGrave() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoBaixoPesoGrave1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.65, 44.0, 25,"feminino"));
    }

    @Test
    public void adultoBaixoPesoGrave2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(1.65, 46.0, 38,"feminino"));
    }

    @Test
    public void adultoBaixoPeso1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.76, 53.0, 54,"masculino"));
    }

    @Test
    public void adultoBaixoPeso2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(1.76, 57.0, 30,"masculino"));
    }

    @Test
    public void adultoPesoNormal1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.63, 50.0, 22,"feminino"));
    }

    @Test
    public void adultoPesoNormal2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(1.71, 73.0, 44,"masculino"));
    }

    @Test
    public void adultoSobrepeso1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.69, 72.0, 39,"feminino"));
    }

    @Test
    public void adultoSobrepeso2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(1.80, 97.0, 33,"masculino"));
    }

    @Test
    public void adultoObesidadeI1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.79, 97.0, 55,"masculino"));
    }

    @Test
    public void adultoObesidadeI2() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(1.81, 114.0, 26,"feminino"));
    }

    @Test
    public void adultoObesidadeII1() {
        calculadoraImc = new CalculadoraImc();
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.77, 110.0, 20,"feminino"));
    }

    @Test
    public void adultoObesidadeII2() {
        calculadoraImc = new CalculadoraImc(); 
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoObesidadeIII() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"feminino"));
    }

    // meninO 2 anos

    @Test
    public void meninoDoisAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDoisAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDoisAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDoisAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDoisAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDoisAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }


    // meninO 4 anos

    @Test
    public void meninoQuatroAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoQuatroAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoQuatroAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoQuatroAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoQuatroAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoQuatroAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }


    // meninO 6 anos

    @Test
    public void meninoSeisAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoSeisAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoSeisAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoSeisAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoSeisAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoSeisAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // meninO 8 anos

    @Test
    public void meninoOitoAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoOitoAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoOitoAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoOitoAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoOitoAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoOitoAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // meninO 10 anos

    @Test
    public void meninoDezAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDezAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDezAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDezAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDezAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDezAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // meninO 12 anos

    @Test
    public void meninoDozeAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDozeAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDozeAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDozeAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDozeAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninoDozeAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // meninA 2 anos

    @Test
    public void meninaDoisAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDoisAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDoisAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDoisAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDoisAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDoisAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }


    // meninA 4 anos

    @Test
    public void meninaQuatroAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaQuatroAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaQuatroAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaQuatroAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaQuatroAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaQuatroAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }


    // meninA 6 anos

    @Test
    public void meninaSeisAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaSeisAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaSeisAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaSeisAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaSeisAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaSeisAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // meninA 8 anos

    @Test
    public void meninaOitoAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaOitoAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaOitoAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaOitoAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaOitoAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaOitoAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // meninA 10 anos

    @Test
    public void meninaDezAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDezAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDezAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDezAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDezAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDezAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    // meninA 12 anos

    @Test
    public void meninaDozeAnosBaixoPeso() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDozeAnosPesoNormal1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDozeAnosPesoNormal2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDozeAnosSobrepeso1() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDozeAnosSobrepeso2() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void meninaDozeAnosObesidade() {
        calculadoraImc = new CalculadoraImc(); // mudar pra setup
        Assert.assertEquals("Obesidade III (obesidade mórbida)", calculadoraImc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

}
