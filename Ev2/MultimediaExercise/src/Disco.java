public class Disco extends Multi{
    private String genero;

    public Disco(String autor, String titulo, String formato, double duracion, String actorPrincipal, String actrizPrincipal, String genero) {
        super(autor, titulo, formato, duracion);
        this.genero = genero;
    }


    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() +"Disco{" + "genero=" + genero + '}';
    }
}
