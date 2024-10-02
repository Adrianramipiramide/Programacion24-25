import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números quieres que muestre");
        int cantidad = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        int actual = 0;

        for (int i = 0; i < cantidad; i++) {
            actual =  num1 + num2;
            System.out.println(actual);
            num1=num2;
            num2=actual;

        }
    }
}
