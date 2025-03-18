import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ej8 {



        public static void main(String[] args) {
            String archivo = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\temperaturas.dat";

            // Generar el archivo con temperaturas
            generarArchivoTemperaturas(archivo);

            // Leer y mostrar los datos del archivo
            leerYMostrarTemperaturas(archivo);
        }


        public static void generarArchivoTemperaturas(String archivo) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo))) {
                String fecha = "1 de enero de 2025";

                // Guardar la longitud de la fecha y la fecha en bytes
                byte[] fechaBytes = fecha.getBytes(StandardCharsets.UTF_8);
                dos.writeInt(fechaBytes.length);
                dos.write(fechaBytes);

                ArrayList<Double> temperaturas = new ArrayList<>();
                double maxTemp = Double.MIN_VALUE;
                double minTemp = Double.MAX_VALUE;
                double sumaTemp = 0;

                for (int hora = 0; hora < 24; hora++) {
                    double temperatura = (Math.random() * 30 - 5); // Genera temperaturas entre -5°C y 25°C
                    temperaturas.add(temperatura);

                    // Escribir en el archivo
                    dos.writeInt(hora);
                    dos.writeDouble(temperatura);

                    // Calcular máxima, mínima y suma para la media
                    if (temperatura > maxTemp) maxTemp = temperatura;
                    if (temperatura < minTemp) minTemp = temperatura;
                    sumaTemp += temperatura;
                }

                double mediaTemp = sumaTemp / 24; // Calcular la media correctamente

                System.out.printf(" Media: %.2f°C%n", mediaTemp);
                System.out.printf(" Máxima: %.2f°C%n", maxTemp);
                System.out.printf(" Mínima: %.2f°C%n", minTemp);

                System.out.println(" Archivo creado con éxito: " + archivo);
            } catch (IOException e) {
                System.err.println(" Error al escribir el archivo: " + e.getMessage());
            }
        }

        public static void leerYMostrarTemperaturas(String archivo) {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(archivo))) {
                // Leer la longitud de la fecha y luego la fecha en bytes
                int longitudFecha = dis.readInt();
                byte[] fechaBytes = new byte[longitudFecha];
                dis.readFully(fechaBytes);
                String fecha = new String(fechaBytes, StandardCharsets.UTF_8);

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
                    System.out.printf("  %02d  |  %.2f°C%n", hora, temperatura);

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


