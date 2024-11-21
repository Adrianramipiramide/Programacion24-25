import java.util.Scanner;

/*
Escribe un programa que indique si un número entero leído por teclado se puede expresar
como el cuadrado de un número entero. Por ejemplo, el número 9 se puede
expresar como el cuadrado de 3, mientras que el 8 no.
(Pista, no hace falta utilizar repetición, utilizar librería matemática).
 */
public class mathPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroRepresentado = sc.nextInt();
        double raiz = Math.sqrt(numeroRepresentado);

        if(numeroRepresentado == Math.pow(raiz,2)){
            System.out.println("La raíz es correcta el resultado es " + raiz);
        }else{
            System.out.println("La raíz no devuelve un número entero");
        }
    }
}
