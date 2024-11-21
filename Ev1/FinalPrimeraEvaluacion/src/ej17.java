import java.util.HashSet;

/*
Realiza un programa que contenga un método para eliminar los números duplicados de un vector de tamaño N.
los números se generarán aleatoriamente entre 1 y 20.
Por ejemplo, si le pasamos el vector {4, 7, 11, 4, 9, 5, 11, 7, 3, 5} nos devolverá {4, 7, 11, 9, 5, 3}.
 */
public class ej17 {
    static final int DIMENSION =10;
    public static void main(String[] args) {
        HashSet<Integer> vector = new HashSet<>(10);
        lenarSet(vector);
        System.out.println(vector);
    }
    public static void lenarSet(HashSet<Integer> vector) {
        for (int i = 0; i < DIMENSION; i++) {
            vector.add((int)(Math.random()*20));
        }


    }
}
