import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        //try con recursos
        try (FileReader fr = new FileReader("entrada.txt")) {
            int leido = 0;
            do {
                if (leido != -1) {
                    leido = fr.read();
                    char caracterLeido = (char) leido;
                    System.out.println("Leido" + caracterLeido);
                }

            } while (leido != -1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
