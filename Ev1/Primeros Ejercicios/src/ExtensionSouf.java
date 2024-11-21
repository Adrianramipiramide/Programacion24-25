import java.util.Scanner;

public class ExtensionSouf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero para hacer la media: ");
        double a = sc.nextDouble();

        System.out.println("Ingrese el primer numero para hacer la media: ");
        double b = sc.nextDouble();

        System.out.println("Ingrese el primer numero para hacer la media: ");
        double c = sc.nextDouble();

        System.out.println("Ingrese el primer numero para hacer la media: ");
        double d = sc.nextDouble();

        double media = (a+b+c+d)/4;

        System.out.printf("La media de los números %.2f %.2f %.2f y %.2f es igual a %f",a ,b,c,d, media);
    }
}