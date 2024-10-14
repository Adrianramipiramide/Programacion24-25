/*
    Crea un programa que nos haga una tabla en la que se reflejen las temperaturas de cada hora del día de toda la semana.
    Rellénalas con valores aleatorios razonables. Muestra los datos por pantalla,
    así como un resumen de la máxima y la mínima de toda la semana así con la media de cada día.
 */
public class bidimensionalArrayTemperatura {
    public static void main(String[] args) {
        //Dia hora temperatura
        int[][] temperaturaSemana = new int[3][24];//{{1,2,3,4,5},{1,2,3,4,5,6,7,8,9,10,11,12},{10,12,14,16,18,20,22,24,26,28}};

        llenarArray(temperaturaSemana);

        for (int i = 0; i < 5; i++) {
            System.out.print("Dia " + temperaturaSemana[0][i]);

            for (int j = 0; j < 8; j++) {

                System.out.print(" Hora " + temperaturaSemana[1][j]);
                System.out.print(" Temperatura " + temperaturaSemana[2][j] + " Cº");
                System.out.println();
            }
        }
    }
//*21 por que hemos acordado un maximo de 20 grados de temperatura
    public static void llenarArray(int[][] temperatura) {
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[0].length; j++) {
                
                temperatura[i][j] = (int) (Math.random() * 21);
            }
        }
    }
}
