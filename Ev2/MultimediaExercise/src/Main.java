/*
Crea un proyecto con las siguientes características:
Escribe una clase Multimedia para almacenar información de objetos de tipo multimedia
(películas, discos…).
Esta clase contiene título, autor, formato y duración como atributos. El atributo formato
(wav, mp3, mpg…) no hace falta declararlo como enumerado, podrá ser de tipo
String al igual que el título y autor.
La duración será con decimales. El valor de todos los atributos, se pasará por parámetro en el
momento de crear el objeto. Esta clase tendrá además un método para devolver cada uno de los
atributos (4 atributos -> 4 métodos) y un método toString que devuelva la información del objeto.
Por último tendrá el método equals() que recibirá un objeto Multimedia y devolverá true en caso de
que el título y el autor sean iguales a los del objeto recibido y false en caso contrario.
Escribe una clase Pelicula que herede de la clase Multimedia. La clase Pelicula tiene, además de
los atributos heredados, un actor principal (String) y una actriz principal (String). Se permite
que uno de los dos sea nulo (null), pero no los dos. La clase debe tener dos métodos para obtener
los dos nuevos atributos y debe sobreescribir el método toString() para que
devuelva, además de la información heredada,
la nueva información. Nota: Para cumplir con el requisito anterior (un actor o una actriz puede
ser nulo pero no los dos a la vez…) se puede controlar en el constructor de la clase Película,
provocando una excepción IllegalArgumentException en caso de que ambos sean null.
Escribe una clase Disco que herede de la clase Multimedia. La clase Disco tiene, aparte de los
elementos heredados, un atributo String para almacenar el género al que pertenece (rock, pop, folk…).
La clase debe tener un método para obtener el nuevo atributo y debe sobreescribir el método toString()
para que devuelva, además de la información heredada, la nueva información.
Escribe una clase ListaMultimedia para almacenar objetos de tipo multimedia. La clase debe tener
un atributo que sea una lista de objetos Multimedia. Utiliza para ello cualquiera de las colecciones
de Java vistas. Basta con que disponga de un método para añadir objetos además del constructor.
Escribe una aplicación PruebaListaMultimedia donde:
Se cree un objeto de tipo ListaMultimedia. Se creen tres discos distintos y se añadan a la lista.
Se creen tres películas distintas y se añadan a la lista. Trabajando con la lista Se muestre por pantalla.
Se calcule la duración total de los objetos de la lista. Se muestre cuántos discos hay de rock.
Se obtenga cuántas películas no tienen actriz principal.
 */
public class Main {
    public static void main(String[] args) {
                Pelicula ElGrinch = new Pelicula("JK.Rowling","El Grinch", "DVD",120.5,"Jeff","Giulia");

                System.out.println(ElGrinch.getAutor());
    }
}
