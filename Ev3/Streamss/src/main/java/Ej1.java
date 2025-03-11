import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {

        String vocales = "aeiouAEIOU";

        String ruta = "/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/target/entrada.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {

            int numVocales = 0;

            System.out.println(args[0]);

            int lectorCaracteres ;

         while ((lectorCaracteres = bf.read()) != -1){

                if (vocales.indexOf(lectorCaracteres) != -1) {
                    numVocales++;
                }
            }
            System.out.println(numVocales);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
