import java.util.Scanner;

//Escribe un programa que lea un número entero por teclado e indique si es par o impar.
public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int numero = sc.nextInt();

        if(numero%2 == 0){
            System.out.println("El número es par");

        } else if (numero%2 != 0) {
            System.out.println("El número es impar");
        }
    }
}
