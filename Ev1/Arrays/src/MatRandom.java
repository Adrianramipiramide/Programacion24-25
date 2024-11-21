/*
Crea un programa que permita almacenar en un array un conjunto de 20 números
enteros de valores comprendidos entre 1 y 100 generados aleatoriamente (utiliza el métod Math.random());
 */
public class MatRandom {
    public static void main(String[] args) {
        int[] array={1,4};

        SacaAleatirio(5,10);

    }
    public static int SacaAleatirio(int min,int max){
        int diferencia = max-min;
        int aleatorio = (int)(diferencia*Math.random()+min+1);
        System.out.println(aleatorio);
        return aleatorio;
    }
}
