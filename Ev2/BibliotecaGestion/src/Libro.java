public class Libro extends ObjetoBiblioteca implements Prestable {
    private boolean prestado = false;

    public Libro(String codigo, String titulo, String year, boolean prestado) {
        super(codigo, titulo, year);
        this.prestado = prestado;
    }


    @Override
    public int cuentaPrestados() {
        int prestados= 0;

        return prestados;
    }

    @Override
    public void prestar(Libro l, boolean prestado) {

    }

    @Override
    public void devolverLibro(Libro l, boolean prestado) {
        if(l.prestado = true){
            l.prestado = false;
        }
        System.out.println("El libro ya no está prestado");
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString() +
                "prestado=" + prestado +
                '}';
    }
}
