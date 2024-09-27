import java.util.Scanner;

//Escribe un programa que lea del teclado tres números e indique el mayor de ellos.
public class ifPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int numero = sc.nextInt();
        System.out.println("Dime un numero");
        int numero2 = sc.nextInt();
        System.out.println("Dime un número");
        int numero3 = sc.nextInt();

        if(numero >= numero2 && numero>= numero3){
            System.out.println("El número mayor es "+ numero);
        } else if (numero2 >= numero && numero2 >= numero3) {
            System.out.println("El número mayor es "+ numero2);
        }else {
            System.out.println("El número mayor es "+ numero3);
        }
    }
}
