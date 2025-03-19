import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CifradoTest {

    @Test
    void cifrarCaracteres() {
        assertEquals('b',Cifrado.cifrarCaracteres('D',2));
    }
}