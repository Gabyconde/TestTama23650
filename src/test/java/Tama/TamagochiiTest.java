package Tama;

import org.junit.Assert;
import org.junit.Test;

public class TamagochiiTest {
    @Test
    public void TestQuePuedoCrearUnTama (){
        Tamagochii tama= new Tamagochii();
        Assert.assertNotNull(tama);
    }
    @Test
    public void TestQuePuedoCrearUnTamaConNombre (){
        Tamagochii tama= new Tamagochii("cleo");

        String esperado="cleo";

        String obtenido= tama.getNombre();

        Assert.assertEquals(esperado,obtenido);
    }
    @Test
    public void testParaCrearDosTamasConDistintoNombre(){
        Tamagochii tama= new Tamagochii("Cleo");
        Tamagochii tama2= new Tamagochii("Javier");

        String esperado1="Cleo";
        String esperado2="Javier";

        String obtenido1= tama.getNombre();
        String obtenido2= tama2.getNombre();

        Assert.assertEquals(esperado1,obtenido1);
        Assert.assertEquals(esperado2,obtenido2);


    }
    @Test
    public void testParaSaberNivelInicialTamagochii(){
        Tamagochii tama= new Tamagochii(0);
        Integer nivelEsperado= 0;

        Integer nivelObtenido= tama.getNivel();

        Assert.assertEquals(nivelEsperado,nivelObtenido);
    }
    @Test
    public void testParaCrearDosTamasConDistintoNivel(){
        Tamagochii tama= new Tamagochii(1);
        Integer nivelEsperado= 1;

        Tamagochii tama2= new Tamagochii(0);
        Integer nivelEsperado2= 0;


        Integer nivelObtenido= tama.getNivel();
        Integer nivelObtenido2= tama2.getNivel();

        Assert.assertEquals(nivelEsperado,nivelObtenido);
        Assert.assertEquals(nivelEsperado2,nivelObtenido2);
    }
    @Test

    public void testQuePruebaQuePuedoModificarElEstadoDeUnTama(){
        Tamagochii tama= new Tamagochii();
        String estadoEsperado= "aburrido";
        tama.setEstado("aburrido");
        Assert.assertEquals(estadoEsperado, tama.getEstado());
    }
    @Test
    public void testQuePruebaCuandoElTamaComePasaDeHambrientoAContento(){
        Tamagochii tama= new Tamagochii();
        tama.setEstado("hambriento");
        tama.comer();
        String estadoEsperado="contento";
        Assert.assertEquals(estadoEsperado,tama.getEstado());

    }
    @Test
    public void testSiEstaContentaSubeSuNivel(){
        Tamagochii tama= new Tamagochii();

    }

}