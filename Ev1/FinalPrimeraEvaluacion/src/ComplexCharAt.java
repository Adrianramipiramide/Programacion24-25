import javax.swing.*;

/*
Implementa un programa que determine la frecuencia de aparición de cada vocal en una cadena de caracteres introducida por teclado.
 Comenzará solicitando la cadena y , posteriormente, construirá un array con las frecuencias de cada vocal.
 Finalmente, imprimirá el array de frecuencias por pantalla (Requisito: No debe diferenciar entre mayúsculas y minúsculas).
 */
public class ComplexCharAt {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("Introduce una palabra");
        int[][] array= new int[5][5];
        MetodosComplexCharAt.contarVocales(nombre,array);
        MetodosComplexCharAt.mostrarArrayVocales(array);
    }
}