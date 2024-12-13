import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Equipo> listaEquipos = new HashSet<>();
        HashSet<Alumno> listaAlumno = new HashSet<>();
        HashSet<Alumno> abombaosLista = new HashSet<>();
        HashSet<Alumno> teamRocketLista = new HashSet<>();
        HashSet<Alumno> atleticoMonzonLista = new HashSet<>();

        Equipo TeamRocket = new Equipo("Team Rocket", "teamrocket@gmail.com");
        Equipo AtleticoMonzon = new Equipo("Atletico Monzon", "monzon@gmail.com");
        Equipo Abombaos = new Equipo("Abombaos","abombaos@gmail.com");

        listaEquipos.add(TeamRocket);
        listaEquipos.add(AtleticoMonzon);
        listaEquipos.add(Abombaos);

        Alumno alumno1 = new Alumno("Jaime","Badia", "Salesianos");
        Alumno alumno2 = new Alumno("Jorge","Ramos", "MordeFuentes");
        Alumno alumno3 = new Alumno("Diego","Castel","Salesianos");
        Alumno alumno4 = new Alumno("Miguel", "Tovar","Salesianos");
        Alumno alumno5 = new Alumno("Francho","Carrera", "Mordefuentes");
        Alumno alumno6 = new Alumno("Marcos",  "Monter", "Pedro J Rubio");
        Alumno alumno7 = new Alumno("Nacho", "Pereda", "Mordefuentes");
        Alumno alumno8 = new Alumno("Unai", "Serrano", "Salesianos");

        listaAlumno.add(alumno1);
        listaAlumno.add(alumno2);
        listaAlumno.add(alumno3);


        atleticoMonzonLista.add(alumno1);
        atleticoMonzonLista.add(alumno2);
        atleticoMonzonLista.add(alumno3);
        abombaosLista.add(alumno4);
        abombaosLista.add(alumno5);
        abombaosLista.add(alumno6);
        teamRocketLista.add(alumno7);
        teamRocketLista.add(alumno8);
        Equipo.mostrarEquipos(listaEquipos);

        AtleticoMonzon.mostrarJugadoresEquipos(atleticoMonzonLista);

    }
}
