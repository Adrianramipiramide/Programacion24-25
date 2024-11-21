import java.util.Arrays;

//Tabla horario asignaturas
public class ArrayBidimensionalPrueba {
    public static void main(String[] args) {
        int[][] asignaturas = {{1, 2, 3, 4,3}, {4, 3, 5, 2,5}, {3, 5, 4, 2,4}, {1, 3, 3, 2,3}, {4, 2, 2, 5,2}};
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%-10s",dias[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < asignaturas.length; i++) {
            for (int j = 0; j < asignaturas[i].length; j++) {
                switch (asignaturas[i][j]) {
                    case 1:
                        System.out.printf("%-10s","Mates\t");
                        break;
                    case 2:
                        System.out.printf("%-10s","Lengua\t");
                        break;
                    case 3:
                        System.out.printf("%-10s","TIC\t");
                        break;
                    case 4:
                        System.out.printf("%-10s","ED\t");
                        break;
                    case 5:
                        System.out.printf("%-10s","Historia\t");
                        break;
                }
             //   System.out.print(asignaturas[i][j] + "\t\t");

            }
            System.out.println();
        }
    }
}
