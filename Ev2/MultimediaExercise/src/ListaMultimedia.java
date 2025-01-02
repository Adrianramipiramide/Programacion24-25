import java.util.ArrayList;

public class ListaMultimedia {
    private ArrayList<Multi> listaMultimedia = new ArrayList<>();

    public ListaMultimedia(ArrayList<Multi> listaMultimedia) {
        this.listaMultimedia = listaMultimedia;
    }

    public void addLista(ArrayList<Multi> listaMultimedia, Multi m) {
        listaMultimedia.add(m);
    }

    public void mostrarLista(ArrayList<Multi> listaMultimedia) {
        for (Multi m : listaMultimedia) {
            System.out.println(m);
        }
    }

    @Override
    public String toString() {
        return "ListaMultimedia{" +
                "listaMultimedia=" + listaMultimedia +
                '}';
    }
}
