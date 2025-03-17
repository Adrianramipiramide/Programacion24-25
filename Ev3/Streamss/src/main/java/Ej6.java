/*
Escribe un método que reciba como argumento el nombre de un fichero de texto (que habrás creado con anterioridad)
y convierta a mayúsculas sus caracteres y los vuelque
 en otro fichero que se pasará como segundo argumento. Utiliza buffering.
 */

import java.io.*;

public class Ej6 {
    public static void main(String[] args) {

        String ruta1 = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\fich1.txt";
        String ruta2 = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\fich2.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(ruta1)); BufferedWriter bw = new BufferedWriter(new FileWriter(ruta2))){

            String lectura = bf.readLine().toUpperCase();
            System.out.println(lectura);

            bw.write(lectura);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
