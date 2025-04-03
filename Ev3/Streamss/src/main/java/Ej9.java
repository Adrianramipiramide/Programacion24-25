import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
Escribe un programa que muestre los nombres de los archivos y los directorios que se
encuentren en un directorio que se pase como argumento (args[0]).
 */
public class Ej9 {
    public static void main(String[] args) throws IOException {
        String ruta = "/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/Directorio";
        //File reader lee un ficheroy tiene q leer un directorio

        File file = new File(args[0]);


        // Lista los archivos y directorios
        String[] archivos = file.list();
        if (archivos != null ) {

            for (String archivo : archivos) {
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("ARCHIVOS DE " + args[0]);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(archivo);
            }
        } else {
            System.out.println("El directorio está vacío.");
        }

    }
}
