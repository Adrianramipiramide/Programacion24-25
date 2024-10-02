import java.util.Scanner;

public class tablero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        char[][] tablero=new char[7][7];

        char barco= 'b';
        tablero[2][3] = barco;
        tablero[4][5] = barco;
//Tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
