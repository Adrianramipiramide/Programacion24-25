import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej1c {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Cálculo Área Triángulo");
        jf.setSize(300, 200);
        jf.setLayout(new GridLayout(4, 2, 10, 10)); // Usamos GridLayout para facilitar distribución

        // Componentes
        JLabel etiqueta = new JLabel("Cálculo Área Triángulo", SwingConstants.CENTER);
        JLabel baseLabel = new JLabel("Base:");
        JTextField baseTexto = new JTextField();

        JLabel alturaLabel = new JLabel("Altura:");
        JTextField alturaTexto = new JTextField();

        JButton boton = new JButton("Calcular");
        JLabel resultado = new JLabel("Área: ", SwingConstants.CENTER);

        // Agregar componentes al frame
        jf.add(etiqueta);
        jf.add(new JLabel("")); // Celda vacía para alinear

        jf.add(baseLabel);
        jf.add(baseTexto);

        jf.add(alturaLabel);
        jf.add(alturaTexto);

        jf.add(boton);
        jf.add(resultado);

        // Listener del botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(baseTexto.getText());
                    double altura = Double.parseDouble(alturaTexto.getText());
                    double area = (base * altura) / 2;
                    resultado.setText("Área: " + area);
                } catch (NumberFormatException ex) {
                    resultado.setText("¡Ingresa números válidos!");
                }
            }
        });

        jf.setVisible(true);
    }
    }

