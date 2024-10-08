import java.util.Scanner;

public class HundirFlota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al hundir la flota\n");
        boolean ganar = false;
        System.out.println("De que tamaño quieres el tablero");
        final int TamanoTablero = sc.nextInt();
        final int posicionMax = TamanoTablero-1;
        System.out.println("\n Cuantos intentos quieres tener");
        final int intentos = sc.nextInt();


        for (int fila = 0; fila < TamanoTablero; fila++) {
            for (int columna = 0; columna < TamanoTablero; columna++) {
                System.out.print("x\t");
            }
            System.out.println();
        }

        System.out.println("\nEn que fila quieres colocar tu barco");
        int PosicionBarco = sc.nextInt();
        if (PosicionBarco > posicionMax) {
            PosicionBarco = posicionMax;
        }
        System.out.println("En que columna quieres colocar tu barco");
        int PosicionBarcoC = sc.nextInt();
        if (PosicionBarcoC > posicionMax) {
            PosicionBarcoC = posicionMax;
        }
        for (int fila = 0; fila < TamanoTablero; fila++) {
            for (int columna = 0; columna < TamanoTablero; columna++) {
                if (PosicionBarco == fila && PosicionBarcoC == columna) {
                    System.out.print("b\t");
                } else {
                    System.out.print("x\t");
                }
            }
            System.out.println();
        }
        System.out.println("El barco está en la posicion " + PosicionBarco + ", " + PosicionBarcoC);


        System.out.println("\n\n\nComineza el juego");
        System.out.println("Tienes " + intentos + " intentos para derribar el barco");

        for (int i = 0; i < intentos; i++) {
            System.out.println("En que fila crees que esta el barco");
            int fuegof = sc.nextInt();
            if (fuegof > posicionMax) {
                fuegof = posicionMax;
            }
            System.out.println("En que columna crees que esta el barco");
            int fuegoc = sc.nextInt();
            if (fuegoc > posicionMax) {
                fuegoc = posicionMax;
            }
            if (fuegof == PosicionBarco && fuegoc == PosicionBarcoC) {
                System.out.println("Has derribado el barco que te faltaba");
                for (int fila = 0; fila < TamanoTablero; fila++) {
                    for (int columna = 0; columna < TamanoTablero; columna++) {
                        if (fila == PosicionBarco && columna == PosicionBarcoC) {
                            System.out.print("b\t");
                            ganar = true;
                        } else {
                            System.out.print("x\t");
                        }

                    }
                    System.out.println();
                }
                break;
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
