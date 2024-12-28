import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/*
Realiza un procedimiento que a partir de un día, mes y año introducido por
el teclado, indique el día de la semana al que corresponde y que fecha será cuando hayan transcurrido 100 días.
 */
public class fechas {
    public static void main(String[] args) {


        LocalDate fecha = LocalDate.of(2005,12,22);
        System.out.println(fecha.getDayOfWeek());
        LocalDate fecha100 = fecha.plusDays(100);
        System.out.println(fecha100);
    }


}
