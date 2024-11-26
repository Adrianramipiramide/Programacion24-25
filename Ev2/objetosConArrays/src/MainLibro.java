public class MainLibro {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Joe", "Dominguez", 43);
        Persona persona2 = new Persona("John", "Doe", 54);
        Libro libro1 = new Libro("La bolsa o la vida", persona1, "4534985843", 276, 21, "Edelvives", "Estados Unidos");
        Libro libro2 = new Libro("Make Time", persona2,"543984859",223,4,"El Mundo", "Estados Unidos");
        System.out.println(libro2);

        System.out.println(libro1.getAutor());
    }
}
