/*
Ejercicio6: Realiza un "mapa" con los nombres de los picos del Pirineo
y su altitud. Comprueba que ocurre si intentas añadir el mismo pico más
de una vez, tanto con la misma altura asignada como distinta.
 */

import java.util.HashMap;

public class MapaPirineos {
    public static void main(String[] args) {
        HashMap<String, Integer> picosPirineo = new HashMap<>();
        rellenarHashMap(picosPirineo, "Aneto", 2342);
        rellenarHashMap(picosPirineo, "Moncayo", 1437);
        rellenarHashMap(picosPirineo,"Moncayo", 1111);
        rellenarHashMap(picosPirineo, "Albarracín", 43543);
        mostrarHashMap(picosPirineo);
    }
    public static void rellenarHashMap(HashMap<String, Integer> picos, String nombre, int altura){
        picos.put(nombre, altura);
    }
    public static void mostrarHashMap(HashMap<String, Integer> pico){
        System.out.println(pico);
    }
}
