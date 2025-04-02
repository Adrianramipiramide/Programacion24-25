import java.io.File;

public class ej12 {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\Streamss\\fich1.txt";
        mostrarInfoArchivo(ruta);
    }

    public static void mostrarInfoArchivo(String ruta) {
        File archivo = new File(ruta);

        if (archivo.exists()) {
            System.out.println("Ruta: " + ruta);

            if (archivo.isFile()) {
                System.out.println("Es un archivo.");
            } else if (archivo.isDirectory()) {
                System.out.println("Es un directorio.");
            }

            System.out.println("Tamaño: " + archivo.length() + " bytes");

            // Mostrar permisos de lectura y escritura
            System.out.println("Permiso de lectura: " + (archivo.canRead() ? "Sí" : "No"));
            System.out.println("Permiso de escritura: " + (archivo.canWrite() ? "Sí" : "No"));
        } else {
            System.out.println("El archivo o directorio no existe");
        }
    }

}
