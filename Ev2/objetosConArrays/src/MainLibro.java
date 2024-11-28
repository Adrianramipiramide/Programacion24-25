import java.time.LocalDate;
import java.time.Month;

public class MainLibro {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(2020,3,21);
        Fecha fecha2 = new Fecha(2023,5,25);
        Persona persona1 = new Persona("Joe", "Dominguez", 43);
        Persona persona2 = new Persona("John", "Doe", 54);
        Libro libro1 = new Libro("La bolsa o la vida", persona1, "4534985843", 276, 21, "Edelvives", "Estados Unidos", fecha1);
        Libro libro2 = new Libro("Make Time", persona2,"543984859",223,4,"El Mundo", "Estados Unidos",fecha1);
        System.out.println(libro2);

        System.out.println(libro1.getAutor());

        libro2.setAutor(persona1);

        libro2.setFecha(2014,5,23);
        System.out.println(libro2.getFecha());

    }
}
