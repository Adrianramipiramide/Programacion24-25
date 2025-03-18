import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*
A partir de los datos de temperaturas por cada hora del día 1 de enero de 2025 en Huesca, escribe un método
que cree un archivo de almacenamiento de datos (no de caracteres) con la siguiente estructura:
- El primer registro es la cadena "1 de enero de 2025"
- El resto de registros lo componen los 24 pares hora-temperatura.


La hora será un entero de 0 a 23 y la temperatura un número con un decimal (las temperaturas puedes simularlas con un Math.random())


Utiliza el fichero del ejercicio anterior y crea un método que permita visualizar los datos que contiene de manera clara por pantalla.
Además deberá mostrar la media, la máxima y la mínima de las temperaturas de ese día.
 */
public class Ej7 {
    public static void main(String[] args) {


        String archivo = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\temperaturas.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo))) {

            String fecha = "1 de enero de 2025";

            byte[] fechaBytes = fecha.getBytes(StandardCharsets.UTF_8);
            dos.write(fechaBytes);

            ArrayList<Double> temperaturas = new ArrayList<Double>();
            double maxTemp = 0;
            double minTemp = 0;
            double mediaTemp = 0;


            for (int hora = 0; hora < 24; hora++) {
                double temperatura = (Math.random() * 30 - 5); // Rango: -5 a 25 grados
                temperaturas.add(temperatura);

                // Guardar en el archivo
                dos.writeInt(hora);   // Guardar la hora
                dos.writeDouble(temperatura); // Guardar la temperatura

                // Calcular máxima, mínima y suma para la media
                if (temperatura > maxTemp) {
                    maxTemp = temperatura;
                }
                if (temperatura < minTemp) {
                    minTemp = temperatura;
                }
                mediaTemp += temperatura;
            }


            System.out.printf("%.2fCº\n",mediaTemp/temperaturas.size());
            System.out.printf("%.2fCº\n",minTemp);
            System.out.printf("%.2fCº\n",maxTemp);
            dos.writeDouble(mediaTemp);
            dos.writeDouble(maxTemp);
            dos.writeDouble(minTemp);

            System.out.println("Archivo creado con éxito: " + archivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }

        leerYMostrarTemperaturas(archivo);
    }


    public static void leerYMostrarTemperaturas(String archivo) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(archivo))) {
            // Leer la fecha
            int longitudFecha = dis.readInt();
            byte[] fechaBytes = new byte[longitudFecha];
            dis.readFully(fechaBytes);
            String fecha = new String(fechaBytes);

            System.out.println("\n Fecha: " + fecha);
            System.out.println(" Hora  |  Temperatura");

            double maxTemp = Double.MIN_VALUE;
            double minTemp = Double.MAX_VALUE;
            double sumaTemp = 0;
            int totalHoras = 0;

            // Leer las temperaturas
            while (dis.available() > 0) {
                int hora = dis.readInt();
                double temperatura = dis.readDouble();
                System.out.printf("  %02d:00  |  %.2f°C%n", hora, temperatura);

                // Calcular máxima, mínima y suma para la media
                if (temperatura > maxTemp) maxTemp = temperatura;
                if (temperatura < minTemp) minTemp = temperatura;
                sumaTemp += temperatura;
                totalHoras++;
            }

            double mediaTemp = sumaTemp / totalHoras;

            // Mostrar los resultados
            System.out.printf("\n Temperatura media: %.2f°C%n", mediaTemp);
            System.out.printf(" Temperatura máxima: %.2f°C%n", maxTemp);
            System.out.printf(" Temperatura mínima: %.2f°C%n", minTemp);
        } catch (IOException e) {
            System.err.println(" Error al leer el archivo: " + e.getMessage());
        }
    }
}
