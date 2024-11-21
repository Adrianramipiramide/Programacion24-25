/*
Escribe un programa que lea un número entero N mayor que 0 y calcule la suma 1+2+3+4+5+6+...+N
 */
public class ej7for {
    public static void main(String[] args) {
        int n = 17;
        int acumulador = 0;

        for (int i = 1; i < n ; i++) {
            System.out.printf("%d + ",i);
            acumulador += i;
        }
        System.out.println(" ="+acumulador);
    }
}
