import java.util.Scanner;

public class MainEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        try{
            while (eleccion != 3) {
                System.out.println("----------------------------");
                System.out.println("BIENVENIDO AL MENU");
                System.out.println("----------------------------");
                System.out.println("Elija la opcion que desea:");
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        System.out.println("Mostrando el número de entradas libres");
                        Entradas.mostrarEntradas();
                        break;
                    case 2:
                        System.out.println("Vender entrada");
                        Entradas.comprarEntradas();
                        break;
                    case 3:
                        System.out.println("Estás saliendo del programa");
                        break;
                    default:
                        System.out.println("El numero introducido no es válido");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
