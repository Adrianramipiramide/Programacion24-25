/*
Escribe programa que contenga un metodo que reciba por parámetro el nombre de un fichero de texto
(que habrás creado con anterioridad) y cuente el número de palabras que contiene.
 */

import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {
        int contadorPalabras = 0;

        String ruta = "/home/estudiante/Escritorio/Programacion24-25/Ev3/Streamss/target/entrada.txt";
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = bf.readLine()) != null) {

                String[] palabras  = linea.split(" ");
                contadorPalabras += palabras.length;

            }

            System.out.println(contadorPalabras);

        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
