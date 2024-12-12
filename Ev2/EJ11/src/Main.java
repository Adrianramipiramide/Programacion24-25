import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Equipo> listaEquipos = new HashSet<>();
        HashSet<Alumno> listaAlumno = new HashSet<>();
        HashSet<Alumno> atleticoMonzonLista = new HashSet<>();

        Equipo TeamRocket = new Equipo("Team Rocket", "teamrocket@gmail.com");
        Equipo AtleticoMonzon = new Equipo("Atletico Monzon", "monzon@gmail.com");
        Equipo Abombaos = new Equipo("Abombaos","abombaos@gmail.com");

        listaEquipos.add(TeamRocket);
        listaEquipos.add(AtleticoMonzon);
        listaEquipos.add(Abombaos);

        Alumno alumno1 = new Alumno("Jaime", "monzon@gmail.com", "Atletico Monzon", "Badia", "Salesianos");
        Alumno alumno2 = new Alumno("Jorge", "monzon@gmail.com", "Atletico Monzon","Ramos", "MordeFuentes");
        Alumno alumno3 = new Alumno("Diego", "monzon@gmail.com", "Atletico Monzon","Castel","Salesianos");

        listaAlumno.add(alumno1);
        listaAlumno.add(alumno2);
        listaAlumno.add(alumno3);

        Equipo.mostrarEquipos(listaEquipos);
        atleticoMonzonLista.add(alumno1);
        atleticoMonzonLista.add(alumno2);
        atleticoMonzonLista.add(alumno3);

        AtleticoMonzon.mostrarJugadoresEquipos(atleticoMonzonLista);

    }
}
