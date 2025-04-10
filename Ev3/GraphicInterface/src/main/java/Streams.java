import java.io.*;

public class Streams {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader(new FileReader("/home/estudiante/Escritorio/Programacion24-25/Ev3/GraphicInterface/hola.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter("/home/estudiante/Escritorio/Programacion24-25/Ev3/GraphicInterface/adios.txt"))){

            String linea ;
            while((linea = bf.readLine())!= null){
                System.out.println(linea);
                bw.write(linea);
                bw.write("\n");
            }
    
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
