import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Ciclista ciclista1 = new Ciclista("Contador", LocalDate.of(2000,12,2),Pais.Spain,40,20000,297,"Orbea Alma");

        ciclista1.competir();
        ciclista1.obtenerPuntuacion();



    }
}
