import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> personas = new HashMap<>();
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("----------------------------------------------------");
            System.out.println("BIENVENIDO A MINDZET");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Crear perfil");
            System.out.println("2. Consejos generales");
            System.out.println("3. Comenzar juego");
            System.out.println("4. Salir del juego");
            System.out.println("Ingresa la opción que quieres elegir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce tu nombre");
                    String nombre = sc.next();
                    System.out.println("Introduce tu edad");
                    int edad = sc.nextInt();
                    Metodos.crearPersona(personas, nombre, edad);
                    Metodos.msotrarPersonas(personas);
                    break;
                case 2:

                case 3:

                case 4:

                default:
                    System.out.println("Introduce un valor correcto");

            }
        }
    }
}
