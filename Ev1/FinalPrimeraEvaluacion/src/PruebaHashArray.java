
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class PruebaHashArray {
    public static void main(String[] args) {
        Arraylist();
        Hashmap();
        treemap();
        hashset();

    }

    public static void Arraylist() {
        System.out.println("ArrayList");
        ArrayList<String> Alumnos = new ArrayList<>();
        Alumnos.add("Steve");
        Alumnos.add("Jose");
        Alumnos.add("Ana");

        String primerAlumno = Alumnos.getFirst();
        System.out.println(primerAlumno);
        Alumnos.sort(String::compareTo);
        System.out.println(Alumnos);
    }

    public static void Hashmap() {
        System.out.println("\nHashMap");
        HashMap<String, Integer> MarcasCoches = new HashMap<>();
        MarcasCoches.put("Audi", 108);
        MarcasCoches.put("Peugeot", 207);
        MarcasCoches.put("Citroen", 3);
        int coche = MarcasCoches.get("Citroen");
        System.out.println(MarcasCoches);
        System.out.println("El coche citroen es del modelo " + coche);
    }

    public static void treemap() {
        System.out.println("\nTreeMap");
        TreeMap<String, Integer> Futbolistas = new TreeMap<>();
        Futbolistas.put("Messi", 33);
        Futbolistas.put("Rodri", 10);
        Futbolistas.put("Pulido", 14);
        System.out.println(Futbolistas);
        System.out.println(Futbolistas.size());

    }public static void hashset(){
        System.out.println("\nHashSet");
        HashSet<String> Libros = new HashSet<>();
        Libros.add("Make Time");
        Libros.add("Limitless");
        Libros.add("La bolsa o la vida");

        System.out.println(Libros);
    }
}
