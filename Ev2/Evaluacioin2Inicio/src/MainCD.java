

public class MainCD {
    public static void main(String[] args) {
        CD cd1 = new CD( "Revolandera");
        CD cd2 = new CD("Noches de verano");

        cd2.agregaCancion(CD.cd,"Mzn");
        cd1.agregaCancion(CD.cd,"Neverita");
        cd2.agregaCancion(CD.cd,"Alma");
        cd1.agregaCancion(CD.cd,"Urus");
        cd2.agregaCancion(CD.cd,"Noches");
        cd2.agregaCancion(CD.cd,"Orbea");
        cd2.eliminaCancion(CD.cd,0);
        System.out.println(cd2);

        cd1.numCanciones();
        cd2.numCanciones();

        try{
            cd2.dameCancion(CD.cd,4);

        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
