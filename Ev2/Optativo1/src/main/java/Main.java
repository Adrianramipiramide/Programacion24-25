import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

         ArrayList<Atleta> atletas = new ArrayList<>();

        Corredor Juan = new Corredor("Juan",LocalDate.of(2005, 2, 12) ,Pais.USA,50,340,34,25);
        Nadador Pedro = new Nadador("Pedro", LocalDate.of(1990,12,10),Pais.Italia,EstiloNatacion.Espalda,23);
        Gimnasta Claudia = new Gimnasta("Claudia", LocalDate.of(2004,10,3),Pais.Spain,EspecialidadGimnasia.Barras,45,56);

        Competicion.agregarAtlerta(Juan);
        Competicion.agregarAtlerta(Pedro);
        Competicion.agregarAtlerta(Claudia);
        Competicion.simularCompeticion();
        Juan.competir();

        Juan.obtenerPuntuacion();
    }


}
