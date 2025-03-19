import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Escribe un programa que muestre los nombres de los archivos y los directorios que se
encuentren en un directorio que se pase como argumento (args[0]).
 */
public class Ej9 {
    public static void main(String[] args) {
        String ruta = "/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/Directorio";
        //File reader lee un ficheroy tiene q leer un directorio
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta))){

            System.out.println(bf.readLine());
            bf.toString();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
