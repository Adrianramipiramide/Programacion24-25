import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al hundir la flota");
        boolean ganar = false;
        final int TamanoTablero = 8;
        final int intentos = 2;

        try {
            for (int fila = 0; fila < TamanoTablero; fila++) {
                for (int columna = 0; columna < TamanoTablero; columna++) {
                    System.out.print("x\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("El caracter introducido no es correcto");
        }
        System.out.println("En que posición quieres colocar tu barco");
        int PosicionBarco = sc.nextInt();

        for (int fila = 0; fila < TamanoTablero; fila++) {
            for (int columna = 0; columna < TamanoTablero; columna++) {
                if (PosicionBarco == fila && PosicionBarco == columna) {
                    System.out.print("b\t");
                } else {
                    System.out.print("x\t");
                }
            }
            System.out.println();
        }
        System.out.println("El barco está en la posicion " + PosicionBarco + ", " + PosicionBarco);


        System.out.println("\nComineza el juego");
        System.out.println("Tienes 3 intentos para derribar el barco");
        System.out.println("En que posición crees que esta el barco");
        for (int i = 0; i < intentos; i++) {
            int fuego = sc.nextInt();
            if (fuego == PosicionBarco) {
                System.out.println("Has derribado el barco que te faltaba");
                for (int fila = 0; fila < TamanoTablero; fila++) {
                    for (int columna = 0; columna < TamanoTablero; columna++) {
                        if (fila == PosicionBarco && columna == PosicionBarco) {
                            System.out.print("b\t");
                            ganar = true;
                        } else {
                            System.out.print("x\t");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("agua");
            }
        }
        if (ganar == true) {
            System.out.println("Felicidades, has ganado la partida");
        } else {
            System.out.println("Lo siento, otra vez será");
        }
    }
}
