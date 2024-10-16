/*
    Crea un programa que nos haga una tabla en la que se reflejen las temperaturas de cada hora del día de toda la semana.
    Rellénalas con valores aleatorios razonables. Muestra los datos por pantalla,
    así como un resumen de la máxima y la mínima de toda la semana así con la media de cada día.
 */
public class bidimensionalArrayTemperatura {
    public static void main(String[] args) {
        //Dia hora temperatura
        int[][] temperaturaSemana = new int[7][24];//{{1,2,3,4,5},{1,2,3,4,5,6,7,8,9,10,11,12},{10,12,14,16,18,20,22,24,26,28}};

        llenarArray(temperaturaSemana);
        System.out.println("Dia Hora Temperatura");
        for (int i = 0; i < 15; i++) {
            System.out.print(temperaturaSemana[0][i] + "\t");
            System.out.print(temperaturaSemana[1][i] + "\t\t");
            System.out.print(temperaturaSemana[2][i] + " Cº");
            System.out.println();

        }
        System.out.println();

        maxTemperatura(temperaturaSemana);
        System.out.println();
        minTemperatura(temperaturaSemana);
        System.out.println();
        mediaSemana(temperaturaSemana[0]);
    }

    //*21 por que hemos acordado un maximo de 20 grados de temperatura
    public static void llenarArray(int[][] temperatura) {
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[0].length; j++) {

                temperatura[i][j] = (int) (Math.random() * 21);
                System.out.print(temperatura[i][j] + "Cº" + " \t");
            }
            System.out.println();
        }
    }

    public static void maxTemperatura(int[][] temperatura) {
        int maxTempDia=0;
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[0].length; j++) {
                if(temperatura[i][j]>maxTempDia){
                 maxTempDia = temperatura[i][j];
        }

        }
            System.out.println("La temperatura Máxima del dia " + (i + 1) + " es " + maxTempDia);
    }
    }

    public static void minTemperatura(int[][] temperatura) {
        int minTempDia=100;
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[0].length; j++) {
                if(temperatura[i][j]<minTempDia){
                    minTempDia = temperatura[i][j];
                }

            }

            System.out.println("La temperatura mínima del dia " + (i+ 1) + " es " + minTempDia);
        }


    }
    public static void mediaSemana(int[] temperaturas){
        double tempAcumulador=0;
        for (int i = 0; i < temperaturas.length; i++) {
            tempAcumulador  += temperaturas[i];
           double media =tempAcumulador/7;
            System.out.printf("La media de la semana "+ (i+1)+ " es %.1f",media);
            System.out.println();
                    }
    }
}
