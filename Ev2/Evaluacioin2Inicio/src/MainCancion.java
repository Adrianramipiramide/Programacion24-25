public class MainCancion {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Hazme saber", "MBA");
        Cancion cancion2 = new Cancion("Ritual de domingo", "Mallazo");
        Cancion cancion3 = new Cancion();

        cancion2.dameTitulo();
        cancion2.ponAutor("Antonio");
        cancion1.ponTitulo("Brrrrrrr");
        cancion1.dameAutor();
        cancion1.dameTitulo();
        cancion3.ponTitulo("Because I got high");
        System.out.println(cancion2);
        cancion3.dameTitulo();
    }
}
