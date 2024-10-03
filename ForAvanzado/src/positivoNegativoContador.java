import java.util.Scanner;

//Escribe un programa que lea una lista de varios números separados por espacios y pon cuantos son positivos y negativos
public class positivoNegativoContador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numero quieres poner");
        int Nnumeros = sc.nextInt();
        int contadorP =0;
        int contadorN =0;

        for (int i = 0; i < Nnumeros; i++) {
            System.out.println("Introduce un numero");
            int numero = sc.nextInt();
            if(numero>0){
                contadorP++;
            }else{
                contadorN++;
            }
        }
        System.out.println("Numeros positivos "+ contadorP);
        System.out.println("Numeros negativos "+ contadorN);

    }
}