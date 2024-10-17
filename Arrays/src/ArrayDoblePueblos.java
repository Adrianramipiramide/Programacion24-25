/*
Rellena un array con los valores del número de habitantes de 200 poblaciones
de entre 100 y 1000 habitantes y ordénalos de mayor a menor. Comprueba si alguna población tiene 500 habitantes exáctamente.
 */
public class ArrayDoblePueblos {
    public static void main(String[] args) {
        int[] numHabitantes = new int[200];

        llenarArray(numHabitantes);
        System.out.println();
        ordenarArray(numHabitantes);

    }
    public static void ordenarArray(int[] habitantesNum){
        for (int i = 0; i < habitantesNum.length; i++) {
            int numActual=habitantesNum[i];
            int numProximo=habitantesNum[i+1];

            if(numProximo<=numActual){
                numActual=numProximo;
                System.out.println("El número de habitantes de la localidad "+ (i+1) + " es " + habitantesNum[i]);
            }
        }

        for (int i = 0; i < habitantesNum.length; i++) {

        }

    }
    public static void llenarArray(int[] habitantesNum){

        for (int i = 0; i < habitantesNum.length; i++) {
            habitantesNum[i] = (int) (Math.random()*1000);
            while(habitantesNum[i]<100){
                habitantesNum[i]=(int) (Math.random()*1000);
            }
        }
        for (int i = 0; i < habitantesNum.length; i++) {
            System.out.println("El número de habitantes de la localidad "+ (i+1) + " es " + habitantesNum[i]);
        }
    }
}
