import javax.swing.*;

//Realiza un programa que pida los 8 dígitos de un número binario a través de una ventana y luego
// muestre en una ventana el binario y su equivalente en digital (JOptionPane).
public class JptionPane {
    public static void main(String[] args) {

        String nombre=  JOptionPane.showInputDialog("Introduce un numero binario de 8 digitos");

        int valor =(int) Math.pow(2,nombre.length()-1);



        for (int i = 0; i < nombre.length(); i++) {
            nombre.charAt(i);
            if(nombre.charAt(i)=='0'){
                Math.pow(i,0);
            } else if (nombre.charAt(i)=='1') {
                nombre +=valor;

            }
            valor /=2;

        }
        JOptionPane.showMessageDialog(null,nombre + " es " + valor);


    }
}
