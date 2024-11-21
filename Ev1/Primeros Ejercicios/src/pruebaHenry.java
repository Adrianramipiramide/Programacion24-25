import java.util.Scanner;

//Escribe una letra y que te de la anterior
public class pruebaHenry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char letra = sc.next().charAt(0);
        char letraAnterior = (char)(letra-1);
        System.out.println("El caracter anterior es " + letraAnterior);

    }
}
