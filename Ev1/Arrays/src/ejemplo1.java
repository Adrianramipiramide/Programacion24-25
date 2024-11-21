import java.util.Scanner;

/*
Haz un programa que pida al usuario qué cantidad de datos quiera almacenar y, posteriormente, se los pida y los almacene en un array.
Finalmente, haz que presente los datos
 */
public class ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos datos quieres almacenar");
        int numeroDatos = sc.nextInt();
        int[] array= new int[numeroDatos];

        for (int i = 0; i < numeroDatos; i++) {
            System.out.println("Introduce la nota");
            array[i]=sc.nextInt();
        }

        mostrarNotas(array);

    }
    public static void mostrarNotas(int[]notas){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("La nota es "+notas[i]);
        }
    }
}
