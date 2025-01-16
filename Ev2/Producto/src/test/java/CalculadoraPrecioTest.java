import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraPrecioTest {
    CalculadoraPrecio calculadoraPrecio = new CalculadoraPrecio();
    Producto producto = new Producto(15,"coche",15000);
    @Test
    void precioConIVA() {
        assertNotEquals(15, calculadoraPrecio.precioConIVA(producto));
        assertEquals(18150,calculadoraPrecio.precioConIVA(producto));
    }
}