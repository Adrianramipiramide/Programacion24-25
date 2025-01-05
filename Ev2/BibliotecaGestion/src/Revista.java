public class Revista extends ObjetoBiblioteca{
    private int numeroRevista;
    public Revista(String codigo, String titulo, int year, int numeroRevista) {
        super(codigo, titulo, year);
        this.numeroRevista = numeroRevista;
    }

    @Override
    public String toString() {
        return "Revista{ "
                + super.toString()+
                " numeroRevista=" + numeroRevista +
                '}';
    }
}
