import java.util.ArrayList;

public class CD {
     static ArrayList<String>cd = new ArrayList<>();
    private int contador = 0;

    public CD( String nombreCancion){

    }
    public int numCanciones(){
        System.out.println("El numero de canciones del CD es " + contador);
        return contador;
    }

    public int dameCancion(ArrayList<String>cd, int numCancion){
        cd.get(numCancion);
        System.out.println("La cancion en la posicion " + numCancion + " es " + cd.get(numCancion));

        return contador;
    }


    public String agregaCancion(ArrayList<String>canciones, String nombreCancion){
        canciones.add(nombreCancion);
        contador++;
        return nombreCancion;
    }

    public int eliminaCancion(ArrayList<String>canciones,int numCancion){
        canciones.remove(numCancion);
        contador--;
        return numCancion;
    }

    @Override
    public String toString() {
        return "CD{" +
                "contador=" + contador +
                '}';
    }
}
