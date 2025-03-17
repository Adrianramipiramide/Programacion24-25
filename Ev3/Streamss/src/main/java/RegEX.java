import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEX {
    public static void main(String[] args) {
        String prueba = "4";

        Pattern p = Pattern.compile("[4,6]");
        Matcher m = p.matcher(prueba);
        boolean coincide = m.matches();
        System.out.println(coincide);
    }
}
