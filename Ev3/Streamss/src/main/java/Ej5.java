import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Escribe un programa que pida al usuario una cadena de caracteres y la guarde al revés en un archivo
de texto cuyo nombre se pasará como segundo argumento.
 */
public class Ej5 {
    public static void main(String[] args) {

       String ruta = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\hola.txt";
        Scanner sc = new Scanner(System.in);
        String caracteres = sc.nextLine();

        String invertida = new StringBuilder(caracteres).reverse().toString();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){

            bw.write(invertida);
            System.out.println(invertida);

        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
