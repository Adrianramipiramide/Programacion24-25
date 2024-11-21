/*
Escribe un programa que genere un array de 1000 números aleatorios positivos menores que 100 y haga lo siguiente:
Ordenar/visualizar los números de la lista en orden creciente.
Calcular la mediana (tras ordenarlos, la mediana es el valor que ocupa el "centro" de la lista de orden creciente).
Ejemplo: si la serie es {-1, 0, 1, 2, 3, 3, 10} la mediana es 2, debido a que en la serie tres números están antes del 2 y tres números están después del 2.
Si tienes un número par de valores en la serie, entonces necesitas conseguir la media de los dos números del medio.
Por ejemplo, si la serie es {0, 1, 2, 3}, la mediana será la media de los dos números del centro (1, 2): es decir 1,5.
Imprimir el número o números que tienen mayor frecuencia de aparición (indicando también el valor de esa frecuencia máxima)

 */
public class MilNumeros {
    public static void main(String[] args) {
        int[] milnumeros = new int[1000];
        generarArray1000numeros(milnumeros);

        System.out.println("\nVector Ordenado");
        ordenarArray(milnumeros);
        calcularMediana(milnumeros);
    }
    public static void generarArray1000numeros(int[] nums){
        for (int i = 0; i < 1000; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + "\t");
            if(i%20==0){
                System.out.println();
            }
        }

    }
    public static void ordenarArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j] > nums[j+1]){
                    int aux = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = aux;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
            if(i%20==0){
                System.out.println();
            }
        }
    }
    public static void calcularMediana(int[] nums){
        double mediana = 0;
        for (int i = 0; i < nums.length; i++) {
            mediana = nums[nums.length/2];
            if(mediana != nums[(nums.length/2)-1]||mediana != nums[(nums.length/2)+1]){
             mediana  =  (nums[nums.length/2] + nums[(nums.length/2)+1] + nums[(nums.length/2)-1])/3 ;
            }
        }
        System.out.println("\nLa mediana es: " + mediana);
    }
}
