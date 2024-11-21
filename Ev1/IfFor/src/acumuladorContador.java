import java.util.Scanner;

//Realiza un porgrama que calcula la media de n números introducidos por teclado
/*
EL valor de n se pedira al usuario al comienzo del programa y sera
un valor positivo mayor que 0.(acumulador y contador)
 */
public class acumuladorContador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuantos números quieres hacer la media");
        int n = sc.nextInt();
        int acumulador=0;
        int entrada;

        for (int i = 0; i < n; i++) {
            System.out.println("Introduzca la nota");
            entrada=sc.nextInt();
            acumulador +=entrada;

        }
        System.out.println("La media se realiza entre "+ n +" números");
        System.out.println("El resultado de la media es "+ ((double)acumulador/n) );

    }
}
