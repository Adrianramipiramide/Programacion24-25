import java.util.Scanner;

public class salarioSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas ha trabajado");

    int hora = 12;
    int horaExtraP = 16;
    int horasTrabajadas = sc.nextInt();

    if(horasTrabajadas<=40) {
        System.out.println("Cobra " + horasTrabajadas*hora + "$");
    } else if (horasTrabajadas>40) {
        int horanormal = hora*40;
        int numhoraExtra = horasTrabajadas-40;
        System.out.println("Cobra "+ (horanormal + numhoraExtra*horaExtraP) + "$");

    }
    }
}