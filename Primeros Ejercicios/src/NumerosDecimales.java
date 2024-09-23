import java.util.Scanner;

//Realiza un programa que pida 2 numeros flotantes
//y luego mustre ep resultado de su división
public class NumerosDecimales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un numero decimal");

        double num = scanner.nextDouble();
        System.out.println("Dame un numero decimal");

        double num2 = scanner.nextDouble();
        double division = num / num2;

        System.out.printf("El resultado de la división entre %.2f / %.2f = %.3f", num, num2, division);


    }
}
