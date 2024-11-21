import java.util.HashSet;
import java.util.Scanner;

/*
Examen de Programación - 1º DAW - Primer Trimestre
Enunciado: Crea un programa en Java que gestione una pequeña base de datos de libros sin el uso de clases personalizadas.
El programa debe contar con un menú para que el usuario pueda realizar las siguientes operaciones:

Añadir libro: El usuario podrá añadir un libro proporcionando su título, autor y género. Los títulos de los libros no deben repetirse.

Listar todos los libros: Muestra la lista completa de los títulos de los libros almacenados.

Buscar libros por género: El usuario introducirá un género, y el programa mostrará todos los libros asociados a ese género.

Buscar libros por autor: El usuario introducirá el nombre de un autor, y el programa mostrará todos los títulos de los libros escritos por ese autor.

Listar géneros disponibles: Muestra todos los géneros literarios únicos que se han registrado.

Eliminar libro: El usuario podrá eliminar un libro por su título. Si este es el único libro de su género o autor, actualiza la base de datos.

Salir: Finaliza la ejecución del programa.

Requisitos:

Usa ArrayList, TreeSet y HashMap para gestionar los datos.
Asegúrate de que el programa no permita añadir libros duplicados y que maneje entradas inválidas de forma adecuada.
Nota: Organiza el código para que sea claro y permite realizar las acciones sin necesidad de reiniciar el programa tras cada operación.
 */
public class LibrosExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion =0;
        HashSet<String> libros= new HashSet<>();
        HashSet<String> generos = new HashSet<>();

        while (opcion != 7) {

            System.out.println("-----------------------");
            System.out.println("BIENVENIDO AL MENU DE LA BIBLIOTECA");
            System.out.println("-----------------------");
            System.out.println("Si desea añadir un libro introduce 1");
            System.out.println("Si desea ver los libros que hay en la lista introduce 2");
            System.out.println("Si desea buscar los libros por genero pulsa 3");
            System.out.println("Si desea buscar los libros por autor pulsa 4");
            System.out.println("Si desea eliminar un libro pulsa 5");
            System.out.println("Si desea ver la lista de generos disponibles pulse 6");
            System.out.println("Si desea salir pulse 7");

            try{
                opcion= sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce los valores del libro");
                        System.out.println("Introduce el titulo del libro");
                        String titulo = sc.next();
                        System.out.println("Introduce el autor del libro");
                        String autor = sc.next();
                        MetodosLibros.anadirLibro(libros, titulo, autor);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Lista libros");
                        MetodosLibros.monstrarListaLibros(libros);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Introduce el genero por el que vas a buscar");
                        //Nose si puedo sacar una lista con los generos y usarla para filtrar
                        break;
                    case 4:
                        System.out.println("Introduce el nombre del Autor");
                        String autornombre = sc.next();
                        MetodosLibros.buscarPorAutor(autornombre, libros);
                        break;
                    case 5:
                        System.out.println("Introduce el titulo del libro que desea eliminar");
                        String tituloLibro = sc.next();
                        MetodosLibros.eliminarLibro(tituloLibro, libros);
                        break;
                    case 6:
                        System.out.println("Mostrando lista de géneros");
                        MetodosLibros.mostrarListaGeneros(generos);
                        System.out.println();
                        break;

                    case 7:
                        System.out.println("Acaba de salir de la aplicación de la biblioteca");
                        break;
                    default:
                        System.out.println("Introduce un valor válido");
                }

            }catch (Exception e){
                System.out.println("El valor introducido es invalido");
            }
    }
}
}
