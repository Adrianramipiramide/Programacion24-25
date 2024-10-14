public class ArrayBidimensionalComplex {
    public static void main(String[] args) {
        int[][] arrayB = {{0, 4, 2, 1, 3}, {2, 3, 2, 9, 2}};

        System.out.println("En el proyecto se ha trabajado " + arrayB[1][4]);

        numHorasTrabajadas(arrayB);
    }

    public static void numHorasTrabajadas(int[][] horasTrabajadas) {
        boolean traajoExcesivo = false;
        for (int i = 0; i < 5; i++) {

            int horasDia;
            horasDia = horasTrabajadas[0][i] + horasTrabajadas[1][i];
            if (horasDia > 8) {
                traajoExcesivo = true;
            }
        }
        if(traajoExcesivo == true){
            System.out.println("Has realizado demasiadas horas");
        }
    }
}
