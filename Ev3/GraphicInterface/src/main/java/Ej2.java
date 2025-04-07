import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Realizar una “calculadora” en la que se introduzcan dos números. Además dispondrá de dos botones, uno de suma y
otro de resta. Al pulsarlos se presentará el resultado correspondiente a esa operación.
 */
public class Ej2 {
    public static void main(String[] args) {

        JFrame marco = new JFrame();
        marco.setLayout(new GridLayout(4, 2, 10, 5));
        JLabel num1 = new JLabel("num1");
        JLabel num2 = new JLabel("num2");
        JTextField etiqueta1 = new JTextField();
        JTextField etiqueta2 = new JTextField();
        JButton boton = new JButton("+");
        JButton boton2 = new JButton("-");
        JLabel resulatado = new JLabel("Resultado :");


        marco.add(num1);
        marco.add(etiqueta1);
        marco.add(num2);

        marco.add(etiqueta2);

        marco.add(boton);
        marco.add(boton2);
        marco.add(resulatado);
        marco.add(new JLabel(""));
        marco.setSize(300, 200);


        boton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent actionEvent) {
                                        try {
                                            int num = Integer.parseInt(etiqueta1.getText());
                                            int num2 = Integer.parseInt(etiqueta2.getText());
                                            resulatado.setText("Resultado " + (num + num2));
                                        } catch (NumberFormatException e) {

                                            System.out.println("Numero Incorrecto");

                                        }
                                    }
                                }
        );

        boton2.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent actionEvent) {
                                         try {
                                             int num = Integer.parseInt(etiqueta1.getText());
                                             int num2 = Integer.parseInt(etiqueta2.getText());
                                             resulatado.setText("Resultado " + (num - num2));
                                         } catch (NumberFormatException e) {

                                             System.out.println("Numero Incorrecto");

                                         }
                                     }
                                 }
        );

        marco.setVisible(true);

    }
}
