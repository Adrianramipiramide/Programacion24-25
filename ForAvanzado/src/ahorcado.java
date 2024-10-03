import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la palabra con la que quiere jugar");
        String palabra = sc.nextLine();

        //Inicializacion de variables
        int contLetras = palabra.length();
        int contFallos = 0;
        final int numMaxFallos = 3;

        System.out.println("La palabra tiene " + contLetras + " letras");

        for (int filas = 0; filas < contLetras; filas++) {
            System.out.print("_ ");
        }
        System.out.println();

        for (int j = 0; j < contLetras; j++) {
            System.out.print((j+1)+ " - " + palabra.charAt(j)+"\t");
        }



    try{
        for (int i = 0; contFallos < numMaxFallos; i++) {
            System.out.println("\nQue letra crees que contiene la palabra");
            String letra = sc.nextLine();
//Da error los charAr dentro de la condicion del if
            if (palabra.charAt(i) == letra.charAt(0) || palabra.charAt(i) == letra.charAt(1) || palabra.charAt(i) == letra.charAt(2) || palabra.charAt(i) == letra.charAt(3)) {
                System.out.println("La letra " + letra + " es correcta");
                for (int filas = 0; filas < contLetras; filas++) {
                    System.out.print("_ ");
                }
                System.out.println();
            } else {
                System.out.println("La letra " + letra + " no es correcta");
                contFallos++;
                System.out.println("Has cometido " + contFallos + " fallo");
            }
        }

        System.out.println("\nHas perdido");
        System.out.println("La palabra es " + palabra);

    }catch (ArrayIndexOutOfBoundsException e){
        e.getMessage();
    }
    }
}
