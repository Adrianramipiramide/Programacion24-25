import java.util.ArrayList;

public class CD {
    private ArrayList<CD>cd = new ArrayList<>();
    private int contador = 0;

    public CD(ArrayList<CD> canciones, String nombreCancion){

        contador++;
    }
    public int numCanciones(){
        System.out.println("El numero de canciones del CD es " + contador);
        return contador;
    }

    public int dameCancion(ArrayList<String>cd){
        cd.get(0);

        return contador;
    }

  /*
    public Cancion agregaCancion(){


    }

    public int eliminaCancion(){

    }
   */

}
