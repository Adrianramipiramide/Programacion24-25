/*
Un programador trabaja en dos proyectos diferentes simultáneamente.
Crea un array bidimensional que represente las horas trabajadas en cada proyecto cada día de la semana y llénalo con valores.
Crea un metodo que compruebe que ningún día se ha trabajado más de 8 horas, y de ser así muestre un mensaje de "trabajo excesivo".
 */
public class ArrayBidimensional {
    public static void main(String[] args) {
        //array budimensional
        int[][] horasPorProyecto= new int[5][2];
        //2 horas el lunes en el proyecto 1
        horasPorProyecto[0][0]=2;

        //5 horas el miercoles en el proyecto2
        horasPorProyecto[2][1]=5;

    }
}
