import java.util.Scanner;

//Escribe un programa que lea del teclado dos números e indique si uno de ellos es múltiplo del otro.
public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        int num = sc.nextInt();
        System.out.println("Dime un número");
        int num2 = sc.nextInt();

        if(num2%num == 0 || num%num2 == 0){
            System.out.println(num + " es multiplo de "+ num2);
        }else{
            System.out.println(num + " no es múltiplo de "+ num2);
        }
    }
}