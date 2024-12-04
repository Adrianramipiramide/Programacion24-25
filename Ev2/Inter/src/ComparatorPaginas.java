import java.util.Comparator;

public class ComparatorPaginas implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) {

        return  Integer.compare(l1.getNumPaginas(), l2.getNumPaginas());

    }
}
