/*
Define tres arrays de 20 números enteros cada uno, con nombres: numero, cuadrado y cubo.
Carga el array numero con valores enteros aleatorios entre 0 y 100.
En el array cuadrado se deben almacenar los cuadrados de los valores del array numero y en cubo, sus cubos.
Muestra el contenido de los arrays, dispuestos en tres columnas.
 */
public class RandomArray {
    public static void main(String[] args) {
        int[]numero = new int[20];
        int[]cuadrado = new int[20];
        int[]cubo = new int[20];


        for (int i = 0; i < numero.length ; i++) {
            numero[i]= (int) (100*Math.random());
            System.out.print(numero[i]+"\t");

            cuadrado[i]= (int)Math.pow(numero[i],2);
            System.out.print(cuadrado[i]+"\t");

            cubo[i]= (int)Math.pow(numero[i],3);
            System.out.println(cubo[i]+"\t");
        }
    }
}
