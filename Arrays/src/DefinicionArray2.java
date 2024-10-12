/*
Define un array de 10 caracteres ya signa los valores a los elementos según la tabla que se muestra a continuación.
Muestra el contenido de todos los elementos del array.
¿Qué sucede con los valores de los elementos que no han sido inicalizados?. Indica la respuesta en forma de comentario.
 */
public class DefinicionArray2 {
    public static void main(String[] args) {


        String[] lista = new String[10];

        for (int i = 0; i < lista.length; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
        lista[0] = "a";
        lista[1] = "x";
        lista[4] = "@";
        lista[6] = " ";
        lista[7] = "*";
        lista[8] = "P";

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+"\t");
        }
    }
}

/*
Aparece null en los Strings no inicializados
 */
