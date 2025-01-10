import org.junit.Test;
import org.junit.*;

public class Calculadores {

    @Test
    public void esPar(){
        Assert.assertEquals(true,true);
        Assert.assertTrue("fg", true);
        
    }

    @Test
    public void esMayorEdad(){
        Assert.assertEquals(true,true);
        Assert.assertNotEquals("20",true);
        Assert.assertEquals(false,false);
    }
}
