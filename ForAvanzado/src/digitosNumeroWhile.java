import java.util.Scanner;

public class digitosNumeroWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int contador = 1;

        while (num > 10) {
            num = num / 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos");
    }
}
