public class Comparator implements java.util.Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        int letra1 = l1.getTitulo().charAt(0);
        int letra2 = l2.getTitulo().charAt(0);
        int resultado = letra1 - letra2;

        if (resultado > 0) {
            System.out.println(l1 + " va antes que " + l2);
        } else {
            System.out.println(l2 + " va antes que " + l1);
        }
        return resultado;
    }
}
