public class Pelicula extends Multi{
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String autor, String titulo, String formato, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(autor, titulo, formato, duracion);
        if(actorPrincipal == null & actrizPrincipal == null){
           throw new IllegalArgumentException("Ambos actores no pueden ser null.");
        }
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula: " + super.toString() + " ,actor principal " +actorPrincipal;
    }
}
