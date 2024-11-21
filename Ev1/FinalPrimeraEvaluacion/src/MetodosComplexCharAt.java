public class MetodosComplexCharAt {
    public static void contarVocales(String nombre, int[][] arrayVocales) {

        int vocales = 0;

        nombre = nombre.toLowerCase();
        for (int i = 0; i < nombre.length(); i++) {

            if (nombre.charAt(i) == 'a') {
                vocales++;
                arrayVocales[1][0]++;
            } else if (nombre.charAt(i) == 'e') {
                vocales++;
                arrayVocales[1][1]++;
            } else if (nombre.charAt(i) == 'i') {
                vocales++;
                arrayVocales[1][2]++;
            } else if (nombre.charAt(i) == 'o') {
                vocales++;
                arrayVocales[1][3]++;
            } else if (nombre.charAt(i) == 'u') {
                vocales++;
                arrayVocales[1][4]++;
            }
        }
        System.out.println("El numero de vocales es " + vocales);

    }

    public static void mostrarArrayVocales(int[][] arrayV) {

        arrayV[0][0] = 'A';
        arrayV[0][1] = ('E');
        arrayV[0][2] = ('I');
        arrayV[0][3] = ('O');
        arrayV[0][4] = ('U');

        for(int i = 0; i < arrayV.length; ++i)
            System.out.println("vocal " + (char)arrayV[0][i] + " aparece " + arrayV[1][i] + " veces");

    }
}
