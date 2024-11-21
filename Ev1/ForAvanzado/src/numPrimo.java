import java.util.Scanner;

/*
cuando es primo o compuesto
 */
public class numPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int numero = sc.nextInt();

//no da bien
        for (int i = 2; i < numero; i++) {
            if((numero%i)==0){
                System.out.println(i+ " Es primo");
            }
        }
    }
}
