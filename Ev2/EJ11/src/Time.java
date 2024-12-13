import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//Comprueba el día de la semana en el que naciste y cuantos días has vivido.
public class Time {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2005, 12, 22);
        DayOfWeek diaSemana = fechaNacimiento.getDayOfWeek();
        System.out.println(fechaNacimiento.getDayOfWeek());

        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(ahora,fechaNacimiento);
        long dias = ChronoUnit.DAYS.between(fechaNacimiento,ahora);
        System.out.println(dias);

        System.out.printf("El dia 22 de Diciembre de 2005 era %s, han transcurrido %s dias",diaSemana,dias);

    }
}
