import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {


        try (FileReader fr = new FileReader("entrada.txt")) {

            int numVocales = 0;

            System.out.println(args[0]);

            for (int i = 0; i < args[0].length(); i++) {
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
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
