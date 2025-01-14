import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class testConversot {
    @Test
     void celsiusFarnheit() {
        assertNotEquals(Conversor.celsiusFarnheit(10),15.6);
        assertEquals(Conversor.celsiusFarnheit(10),50);
        assertEquals(Conversor.celsiusFarnheit(-10),14);
    }

    @Test
    void farenheitCelsius(){
        assertNotEquals(Conversor.farenheitCelsius(10),10);
    }
}
