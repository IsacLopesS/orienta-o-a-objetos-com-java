import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntendendoOrdemDeExecucaoDosMetodosDeTest {

    /*
     * Beforeclass
     * before
     * teste1
     * after
     * before
     * test2
     * after
     * before
     * test3
     * after
     * afterclass
     */
    

    
    @Test
    public void teste1(){
        System.out.println("teste 1");
    }

    @Test
    public void teste2(){
        System.out.println("teste 2");
    }

    @Test
    public void teste3(){
        System.out.println("teste 3");
    }

    @BeforeClass
    public static void beforeclass(){
        System.out.println("BeforeClass");
    }

    @Before
    public void before(){
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("after");
    }

    @AfterClass
    public static void afterclass(){
        System.out.println("afterClass");
    }
    
}
