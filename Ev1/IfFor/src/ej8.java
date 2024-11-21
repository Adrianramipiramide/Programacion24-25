import java.util.Scanner;

/*
Escribe un programa que solicite al usuario un número N y luego muestre por pantalla la siguiente ejecución:
1
1 2
1 2 3
1 2 3 4
…………
1 2 3 4 …..N
 */
 class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.printf("%d \t",j);

            }
            System.out.printf(" \t \n");
        }
    }
}