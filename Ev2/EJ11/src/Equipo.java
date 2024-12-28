import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;


public class Equipo {
    private String nombreEquipo;
    private String emailE;
    private Alumno alumno;
    HashSet<Alumno> listaAlumnos = new HashSet<>();
    public Equipo(String nombreEquipo, String emailE) {
        this.nombreEquipo = nombreEquipo;
        this.emailE = emailE;

    }


    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getEmailE() {
        return emailE;
    }

    public void mostrarJugadoresEquipos(HashSet<Alumno>listaAlumnos){
        System.out.println(listaAlumnos);

    }

    public HashSet<Alumno> getListaAlumno() {
        return listaAlumnos;
    }

    public static void mostrarEquipos(ArrayList<Equipo> listaEquipos){
        for (Equipo equipo : listaEquipos){
            System.out.println(equipo + "\n");
        }
    }


    public static void addEquipo(ArrayList<Equipo> listaEquipos, HashMap<Equipo, Integer> equipoCounter, Equipo equipo) {
        int count = equipoCounter.getOrDefault(equipo, 0); // Obtiene el conteo actual del equipo o 0 si no existe en el HashMap
        if (count < 2) { //equipo añadido menos de 2 veces
            listaEquipos.add(equipo);
            equipoCounter.put(equipo, count + 1);
        } else {

            System.out.println("No se puede añadir el equipo \"" + equipo.getNombreEquipo() + "\" más de 2 veces.");
        }
    }


    // Método para obtener un Comparator que ordena por nombre del equipo
    public static Comparator<Equipo> getComparatorPorNombre() {
        return new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                return e1.getNombreEquipo().compareToIgnoreCase(e2.getNombreEquipo());
            }
        };
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", emailE='" + emailE + '\'' +
                '}';
    }
}
