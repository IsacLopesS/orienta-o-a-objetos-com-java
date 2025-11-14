import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarroTest {

    @Before
    public void Testbefore(){

    }

    @BeforeClass
    public void TestbeforeClass(){
        
    }

    
    @Test
    public void testAcelerar() {
        Carro c = new Carro();
        c.velocidade=2;
        c.potencia=3;

        c.acelerar();
        assertEquals(5, c.velocidade);      
    }


    @Test
    public void testFreiar() {

        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.freiar();

        assertEquals(5, c.getVelocidade());
        
    }

     @Test
    public void testFreiarAteZero() {

        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.freiar();
        c.freiar();
        c.freiar();
        c.freiar();

        assertEquals(0, c.getVelocidade());
        
    }

    @Test
    public void TestVelocidadeZero(){
        Carro c = new Carro();

        assertEquals(0, c.getVelocidade());

    }

    @Test
    public void TestAcelerarAteOLimite(){
        Carro c = new Carro();
        c.potencia = 20;
        c.acelerar();
        assertEquals(20, c.getVelocidade());
        c.acelerar();
        assertEquals(40, c.getVelocidade());
        c.acelerar();
        assertEquals(60, c.getVelocidade());
        c.acelerar();
        assertEquals(80, c.getVelocidade());
        c.acelerar();
        assertEquals(100, c.getVelocidade());
        c.acelerar();
        assertEquals(100, c.getVelocidade());
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        //assertEquals(100, c.getVelocidade());
    }

     @Test
    public void TestAcelerarAteOLimite2(){
        Carro c = new Carro();
        c.potencia = 20;
        c.velocidade=99;
        c.acelerar();
        
        assertEquals(100, c.getVelocidade());
    }

}
