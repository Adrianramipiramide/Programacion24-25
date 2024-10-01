import java.util.Scanner;

/*
Debido a una pertinaz sequía se decidió poner en práctica un sistema de cobro de agua
 que penalice el consumo excesivo tal como indica la tabla siguiente:
Consumo ( en metros cúbicos)
€ por metro cúbico
Primeros 100
0.15
De 100 a 500
0.20
De 500 a 1000
0.35
Más de 1000
0.80
Escribe un programa que lea del teclado los metros cúbicos consumidos y muestre en la
pantalla el coste de agua total. Ten en cuenta que en la tabla se indica lo que hay que cobrar
 por los metros cúbicos que se encuentran en el intervalo.
 Así si hemos consumido 750 deberíamos pagar: 1000.20+250*0.35 = 182.50 €. Usa constantes.
 */
public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de litros consumidos: ");
        int litros = sc.nextInt();

        double consumo500 = (((litros-100)*0.20)+(100*0.15));
        double consumo1000=(consumo500+((litros-500)*0.35));

        if (litros <= 100) {
            System.out.println("El consumo ha sido "+ litros*0.15);
        } else if (litros>=100 && litros<=500) {
            System.out.println("El consumo ha sido "+ (((litros-100)*0.20)+(100*0.15)));
        } else if (litros >=500 && litros<=1000) {
            System.out.println("El consumo ha sido "+ ((((400)*0.20)+(100*0.15))+((litros-500)*0.35)));
        } else if (litros >=1000) {
            System.out.println("El consumo ha sido "+ (((((400)*0.20)+(100*0.15))+((litros-500)*0.35))+((litros-1000)*0.80)));
        }
    }

}
