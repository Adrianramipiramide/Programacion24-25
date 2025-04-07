import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej4 {
    public static void main(String[] args) {

        JFrame jfram = new JFrame("Calculadora");
        jfram.setLayout(new GridLayout(4,4,10,5));
        jfram.setSize(300,400);
        JLabel etiqueta = new JLabel("Dato 1");
        JLabel etiqueta2 = new JLabel("Dato 2");
        JLabel etiqueta3 = new JLabel("Resultado");
        JTextField area = new JTextField();
        JTextField area2 = new JTextField();
        JTextField area3 = new JTextField();
        JButton sumar = new JButton("+");
        JButton restar = new JButton("-");
        JButton multiply = new JButton("*");
        JButton dividir = new JButton("/");
        ImageIcon i = new ImageIcon("/home/estudiante/Descargas/exit.jpg","Foto salida");
        ImageIcon teclado = new ImageIcon("/home/estudiante/Descargas/teclado.jpg", "Teclado");
        JLabel fotonTeclado = new JLabel(teclado);
        JButton salir = new JButton(i);
        
        jfram.add(fotonTeclado);

        jfram.add(etiqueta);
        jfram.add(area);
        jfram.add(sumar);
        jfram.add(etiqueta2);
        jfram.add(area2);
        jfram.add(restar);
        jfram.add(etiqueta3);
        jfram.add(area3);
        jfram.add(multiply);
        jfram.add(new JLabel(""));
        jfram.add(salir);
        jfram.add(dividir);




        jfram.setVisible(true);

        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    int num1 = Integer.parseInt(area.getText());
                    int num2 = Integer.parseInt(area2.getText());
                    int resultado = num1 + num2;
                    area3.setText(String.valueOf(resultado));
                }catch (NumberFormatException e) {
                    System.out.println("Numero no valido");
                }
            }
        });


        restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    int num1 = Integer.parseInt(area.getText());
                    int num2 = Integer.parseInt(area2.getText());
                    int resultado = num1 - num2;
                    area3.setText(String.valueOf(resultado));
                }catch (NumberFormatException e){
                    System.out.println("Numero no valido");
                }

            }
        });


        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    int num1 = Integer.parseInt(area.getText());
                    int num2 = Integer.parseInt(area2.getText());
                    int resultado = num1 * num2;
                    area3.setText(String.valueOf(resultado));
                }catch (NumberFormatException e){
                    System.out.println("Numero no válido");
                }
            }
        });


        dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    double num1 = Double.parseDouble(area.getText());
                    double num2 = Double.parseDouble(area2.getText());
                    double resultado = num1 / num2;
                    area3.setText(String.valueOf(resultado));
                }catch (NumberFormatException e){
                    System.out.println("Número no valido");
                }
            }
        });
    }
}
