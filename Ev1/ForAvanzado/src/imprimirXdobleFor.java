/*
Haz un programa que pinte una x
 */
public class imprimirXdobleFor {
    public static void main(String[] args) {
        //Utilizando switch case por primera vez.

        final int dimension = 8;

        for (int i = 1; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {

             //   System.out.print("x\t");

                if (j == i || i + j == dimension) {
                 System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
           System.out.println();
        }
    }
}
