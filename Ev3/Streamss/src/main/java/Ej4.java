import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Escribe un programa que contenga un metodo que reciba por parámetro el nombre de un fichero de texto
(que habrás creado con anterioridad) y lo muestre por pantalla sin espacios en blanco.
 */
public class Ej4 {
    public static void main(String[] args) {
        String ruta = "/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/target/entrada.txt";
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            System.out.println(bf.read());
            FileWriter fw = new FileWriter(ruta);
            fw.write("Arian Rami");
/*

while(bf.read() != -1){
                for (int i = 0; i < bf.read(); i++) {
                    if(i == -1){

                    }
                }
            }

 */
            System.out.println(bf.read());

        }catch(IOException e ){
            e.printStackTrace();
        }
    }
}
