import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarIpRegex {
    public static void main(String[] args) {

        try(BufferedReader bf = new BufferedReader(new FileReader("/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/access.log"))){
            String regex = "chic.s";
            String texto ="chicos chicos chicos chicos chicos chicos chicos chicos chicos";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(texto);
            System.out.println(matcher.find());
            int cont=0;
            while(matcher.find()){

                    cont++;

            }
            System.out.println(cont);
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
