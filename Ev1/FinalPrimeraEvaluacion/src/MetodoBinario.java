public class MetodoBinario {
    public static int PasarNumADecimal(String num) {
        int valorNum = 0;
        try {
            for (int i = 0; i < num.length(); i++) {
                num.charAt(i);
                if (num.charAt(i) == '0') {

                } else if (num.charAt(i) == '1') {
                    valorNum += (int) Math.pow(2, num.length() - i - 1);

                }
            }
            System.out.println("El numero binario " + num + " es " + valorNum);

        } catch (Exception e) {
            System.out.println("Error al leer el numero");
        }
        return valorNum;
    }
}
