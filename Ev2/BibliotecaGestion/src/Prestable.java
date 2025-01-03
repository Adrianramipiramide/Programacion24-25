public interface Prestable {
    public int cuentaPrestados();

    public void prestar(Libro l, boolean prestado);

    public void devolverLibro(Libro l, boolean prestado);
}
