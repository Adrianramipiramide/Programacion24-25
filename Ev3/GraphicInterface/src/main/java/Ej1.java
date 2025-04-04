import javax.swing.*;
import java.awt.*;

/*
Realiza un programa para calcular el área de un triángulo según su base y su altura.
La interfaz debe ser como la que se muestra a continuación y responder de un modo análogo.
 */
public class Ej1 {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        JLabel etiqueta = new JLabel("Calculo Área Triangulo");
        JLabel base = new JLabel("Base");
        JLabel altura = new JLabel("Altura");
        FlowLayout layout = new FlowLayout();
        base.setLayout(layout);
        altura.setLayout(layout);
        jf.setSize(500,500);
        JTextField areaTexto = new JTextField();
        areaTexto.setSize(100,50);
        JTextField areaTexto2 = new JTextField();


        JButton boton = new JButton("Calcular");
        boton.setSize(40,20);
        jf.add(base);
        jf.add(altura);
        jf.add(areaTexto,BorderLayout.LINE_END);
        jf.add(areaTexto2, BorderLayout.EAST);
        jf.add(boton, BorderLayout.SOUTH);
        jf.add(etiqueta,BorderLayout.NORTH);
        jf.setVisible(true);
    }
}
