import java.util.HashMap;

public class Metodos {
    public static void crearPersona(HashMap<String, Integer> personas, String nombre, int edad) {
        personas.put(nombre, edad);
    }
    public static void msotrarPersonas(HashMap<String, Integer> personas) {
        System.out.println(personas);
    }
}
