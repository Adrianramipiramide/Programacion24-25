import java.util.ArrayList;

/*
Crea un proyecto con las siguientes características para la gestión de una biblioteca
que contenga libros y revistas: Las características comunes que se almacenan tanto para las
revistas como para los libros son el código, el título y el año de publicación. Estas tres
características se pasan por parámetro en el momento de crear los objetos. Los libros tienen
además un atributo prestado. Los libros cuando se crean no están prestados.
Las revistas tienen un número, en el momento de crear las revistas se pasa el número
(entero) por parámetro. Tanto las revistas como los libros deben tener
(aparte de los constructores) un método toString() que devuelve el valor
de todos los atributos en una cadena de caracteres. También tienen un método
que devuelve el año de publicación y otro para el código. Para prevenir posibles
cambios en el programa se tiene que implementar una interfaz Prestable con los métodos
prestar(), devolver() y prestado(). La clase Libro implementa esta interfaz. Escribe una
aplicación en la que se implementen dos métodos: cuentaPrestados(): recibe por parámetro
un array de objetos y devuelve cuántos de ellos están prestados. publicacionesAnterioresA():
recibe por parámetro un array de Publicaciones y un año, devolviendo cuántas publicaciones
tienen fecha anterior al año recibido por parámetro. En el método main() crear un array de
Publicaciones con 2 libros y 2 revistas, prestar uno de los libros, mostrar por pantalla los
datos almacenados en el array y mostrar por pantalla cuántas publicaciones hay prestadas y
cuántas hay anteriores a 1980 utilizando los métodos escritos anteriormente.
 */
public class Main {
    public static void main(String[] args) {


        Libro MakeTime = new Libro("439854", "Make Time", 2024, false);
        Libro ElArteDeLaGuerra = new Libro("454964", "El Arte de la Guerra", 1028, false);


        ArrayList<Libro> listaLibros = new ArrayList();
        listaLibros.add(MakeTime);
        listaLibros.add(ElArteDeLaGuerra);


        Revista MundoDeportivo = new Revista("545394", "Mbape se retira", 2026, 23);
        Revista Marca = new Revista("545395", "El Huesca sube a primera", 2025, 78);

        ArrayList<Revista> listaRevistas = new ArrayList();
        listaRevistas.add(MundoDeportivo);
        listaRevistas.add(Marca);

        ArrayList<ObjetoBiblioteca> listaFull = new ArrayList();
        listaFull.add(MakeTime);
        listaFull.add(ElArteDeLaGuerra);
        listaFull.add(Marca);
        listaFull.add(MundoDeportivo);



        MakeTime.prestar();
        MakeTime.cuentaPrestados(listaFull);
        ElArteDeLaGuerra.librosAntesDe(ElArteDeLaGuerra,123);

        System.out.println(Marca.getYear());



    }
}
