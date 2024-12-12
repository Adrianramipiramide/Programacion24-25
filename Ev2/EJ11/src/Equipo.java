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

    public static void mostrarEquipos(HashSet<Equipo> listaEquipos){
        for (Equipo equipo : listaEquipos){
            System.out.println(equipo + "\n");
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", emailE='" + emailE + '\'' +
                ", alumno=" + alumno +
                '}';
    }
}
