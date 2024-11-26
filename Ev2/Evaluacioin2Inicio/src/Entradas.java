 import java.util.Scanner;

public class Entradas {
    private static int ENTRADASRESTANTES = 1000;
    private static int ENTRADASCOMPRAVENTA = 200;
    private static int ENTRADASVIP = 25;

    public static void mostrarEntradas() {
        System.out.println("Entradas Normales: " + ENTRADASRESTANTES);
        System.out.println("Entradas CompraVenta " + ENTRADASCOMPRAVENTA);
        System.out.println("Entradas VIP " + ENTRADASVIP);
    }

    public static void comprarEntradas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quie tipo de entrada quieres comprar: ");
        System.out.println("1. NORMAL");
        System.out.println("2. COMPRAVENTA");
        System.out.println("3. VIP");
        int tipoEntrada = sc.nextInt();

        System.out.println("Cuantas entradas quieres comprar");
        int numEntradas = sc.nextInt();
        if (tipoEntrada == 1) {
            if (ENTRADASRESTANTES - numEntradas > 0) {
                ENTRADASRESTANTES -= numEntradas;
                System.out.println("Has comprado " + numEntradas + " entrada Normal, el numero restante de entradas Normales es " + ENTRADASRESTANTES);
            } else {
                System.out.println("Lo siento no quedan entradas");
            }

        } else if (tipoEntrada == 2) {
            if (ENTRADASCOMPRAVENTA - numEntradas > 0) {
                ENTRADASCOMPRAVENTA -= numEntradas;
                System.out.println("Has comprado " + numEntradas + " entrada COMPRAVENTA, el numero restante de entradas CompraVenta es " + ENTRADASCOMPRAVENTA);
            } else {
                System.out.println("Lo siento no quedan entradas");
            }

        } else if (tipoEntrada == 3) {
            if (ENTRADASVIP - numEntradas > 0) {
                ENTRADASVIP -= numEntradas;
                System.out.println("Has comprado " + numEntradas + " entrada VIP, el numero restante de entradas VIP es " + ENTRADASVIP);
            } else {
                System.out.println("Lo siento no quedan entradas");
            }
        }
    }
}
