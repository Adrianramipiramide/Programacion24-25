import java.time.LocalDate;
import java.time.LocalTime;

/*
Realiza un procedimiento que vuelque la fecha actual en seis variables correspondientes al año, mes, día, hora, minutos y segundos.
 */
public class Fechas2 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        System.out.printf("La fecha actual es %s",fechaActual.atTime(LocalTime.now()));
    }
}
