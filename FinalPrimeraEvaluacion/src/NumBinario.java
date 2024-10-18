import javax.swing.*;

/*
Escribe un programa que lea del teclado un número binario con cualquier número de cifras y lo transforme en decimal.
 */
public class NumBinario {
    public static void main(String[] args) {
        String numeroBinario = JOptionPane.showInputDialog("Introduce un número binario");
        MetodoBinario.PasarNumADecimal(numeroBinario);
    }
}
