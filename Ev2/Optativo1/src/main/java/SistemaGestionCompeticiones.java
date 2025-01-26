import java.util.ArrayList;


public class SistemaGestionCompeticiones implements Comparable<Competicion> {
    ArrayList<Competicion> competiciones= new ArrayList();

    public void agregarCompeticion(Competicion competicion){
        competiciones.add(competicion);
    }

    public ArrayList<Competicion> mostrarCompeticiones(){
        ArrayList<Competicion> competicioness= new ArrayList();
        for(Competicion competicion: competiciones){
            System.out.println(competicion);
            competicioness.add(competicion);
        }
        return competicioness;
    }


    public void simularTodasCompeticiones(){


    }


    public void agregarCompetencia(Competicion competicion){

    }

    @Override
    public int compareTo(Competicion o) {
        int resultado = 0;
        for(int i=0; i<competiciones.size(); i++){
            if(o.getNombre().equals(competiciones.get(i).getNombre())){
                resultado = 1;
            }
        }
        return resultado;
    }
}
