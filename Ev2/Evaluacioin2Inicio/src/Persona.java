import java.util.ArrayList;

/*
Crea una clase Persona con los atributos nombre y edad. Agrega un metodo presentarse() que muestre un
mensaje como "Hola, me llamo [nombre] y tengo [edad] años".
Luego, crea varias instancias de Persona y llama al metodo presentarse() en cada una.
 */
public class Persona {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void presentacion() {
        System.out.println("Hola soy " + this.nombre + " y tengo " + this.edad + " años");
    }


    public void muestraReservas(ArrayList<String> reservas){
        System.out.println(reservas);
    }
}
