import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {

        JFrame jframe = new JFrame("Iniciar Sesion");
        jframe.setLayout(new GridLayout(3,2,4,10));

        JLabel Usuario = new JLabel("Usuario");
        JLabel Constrasena = new JLabel("Contraseña");

        JTextField area = new JTextField();
        JPasswordField area2 = new JPasswordField();

        JButton boton = new JButton("Validar");


        jframe.add(Usuario);
        jframe.add(area);
        jframe.add(Constrasena);
        jframe.add(area2);
        jframe.add(new JLabel(""));
        jframe.add(boton);
        jframe.setSize(300,200);
        jframe.setVisible(true);



        boton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent actionEvent) {

                                            if(validar(area)){
                                                jframe.setTitle("Validacion Correcta");
                                            }else {
                                                jframe.setTitle("Validacion Incorrecta");
                                            }
                                    }
                                }
        );
    }

    public static boolean validar(JTextField area){
        ArrayList<String> Personas = new ArrayList<>();
        Personas.add("Juan");
        Personas.add("Pedro");
        Personas.add("Lucas");

        boolean validado = false;
        for (String p : Personas ){
            if(area.getText().equals(p)){
                validado = true;
            }
        }


        return validado;
    }
}
