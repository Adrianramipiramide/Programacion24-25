import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class HashTreeSet {
    public static void main(String[] args) {
        TreeSet<String> matriculados = new TreeSet<>();
        matriculados.add("Castel");
        matriculados.add("Tarazoniano");
        matriculados.add("Calvo");
        matriculados.add("Alonso");
        System.out.println(matriculados);


        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Casa", "Lugar donde vives");
        diccionario.put("Coche", "Vehiculo");
        System.out.println(diccionario.get("Coche"));

        anotarPalabras();


    }
    public static void anotarPalabras(){
        String palabra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la palabra");
        palabra=sc.nextLine();

        System.out.println("Introduce el significado");
        palabra=sc.nextLine();
        


    }
}
