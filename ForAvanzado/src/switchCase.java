import java.util.Scanner;

/*
Escribe un numero en que se pida un numero del 1 al 7
y responda con el numero de la semana(switch case)
utiliza control de excepciones
 */
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7");
        int numero =sc.nextInt();

        switch (numero){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }
    }
}
