import java.util.ArrayList;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(34,"Amarfay");
        Persona persona2 = new Persona(54, "Henry");

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<String> reservas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);


        for (Persona p: personas) {
            p.presentacion();
        }

    }
}
