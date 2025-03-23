import java.io.*;
import java.util.ArrayList;

/*
Escribe un método que reciba por parámetro dos rutas correspondientes a un archivo de origen y a otro de destino
y que copie el archivo de origen al de destion. La ruta de destino puede corresponder a un archivo o a un directorio.
 En el primer caso, el archivo se creará en el directorio especificado manteniendo su nombre. En el segundo, se tomará
 como nombre del archivo copia el que especifique su ruta. Además, el método recibirá un tercer parámetro que actuará de
 bandera, para el caso en que el archivo especificado como destino exista previamente. Si la bandera es cierta, el archivo
 existente se sobreescribirá con la copia. En caso contrario, la operación de copia terminará.
El método generará una excepción si la bandera de reemplazo vale false y el archivo de destino existe.
 */
public class ej10 {
    public static void main(String[] args) {

        String ruta1 = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\fich1.txt";
        String ruta2 = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\fich2.txt";
        copyPaste(ruta1,ruta2,true);
    }


    public static void copyPaste(String rutaInicio, String rutaDestino, boolean flag){

        try(BufferedReader br = new BufferedReader(new FileReader(rutaInicio)) ; BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino,flag))){

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
