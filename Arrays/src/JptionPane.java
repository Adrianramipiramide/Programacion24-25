import javax.swing.*;

//Realiza un programa que pida los 8 dígitos de un número binario a través de una ventana y luego
// muestre en una ventana el binario y su equivalente en digital (JOptionPane).
public class JptionPane {
    public static void main(String[] args) {

        String traducidoNumero ;
        int acumulador=0;

        String nombre=  JOptionPane.showInputDialog("Introduce un numero binario de 8 digitos");

        for (int i = 0; i < nombre.length(); i++) {
            nombre.charAt(i);
            if(i==0){
                Math.pow(i,0);
            } else if (i==1) {
               acumulador == (int)Math.pow(nombre,2);
            }
        }

        JOptionPane.showMessageDialog(null,nombre + " es " + traducidoNumero);

    }
}
