import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarIpRegex {
    public static void main(String[] args) {

        try(BufferedReader bf = new BufferedReader(new FileReader("/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/access.log"))){
            String regex = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b\n";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher("/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/access.log");
            System.out.println(matcher.find());
            //System.out.println(matcher.group());
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
