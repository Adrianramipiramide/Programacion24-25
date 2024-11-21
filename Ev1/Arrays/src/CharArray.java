public class CharArray {
    public static void main(String[] args) {
        char[] cadena = {'H','O','L','A'};
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }
        System.out.println();
        String palabra = "HOlA";
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
        System.out.println();
        for (char caracter : cadena){
            System.out.println(caracter);
        }
    }
}
