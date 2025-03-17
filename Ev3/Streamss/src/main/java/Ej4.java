import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Escribe un programa que contenga un metodo que reciba por parámetro el nombre de un fichero de texto
(que habrás creado con anterioridad) y lo muestre por pantalla sin espacios en blanco.
 */
public class Ej4 {


        String ruta = "/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/target/entrada.txt";

        public static void mostrarSinEspacios(String ruta) {
            try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {
                String linea;
                while ((linea = bf.readLine()) != null) {
                    // Eliminar espacios en blanco
                    System.out.println(linea.replaceAll("//s+", ""));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
