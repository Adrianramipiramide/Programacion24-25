/*
Define un array de 12 números y asigna valores a los elementos según la tabla que se muestra a
 continuación. Muestra el contenido de todos los elmentos del array.
 ¿Qué sucede con los valores de los elementos que no han sido inicializados?.
  Indica la respuesta en forma de comentario.
 */
public class ArrayDefinicion {
    public static void main(String[] args) {
        final int longitudArray= 12;
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        array[1]=3;
        array[5]=7;
        array[8]=10;
        array[11]=55;

        for (int i = 0; i <longitudArray ; i++) {
            System.out.print(array[i]+"\t");
        }

        //Los valores de serie mantienen su valor, los que camias se cambian
    }
}
