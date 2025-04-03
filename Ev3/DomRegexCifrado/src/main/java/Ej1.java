import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Utilizando expresiones regulares, realiza los siguientes procedimientos para validar strings que se leerán por teclado:
Validar un número de teléfono nacional sin espacios: ej 974283921
Validar un número de teléfono internacional: ej (+34)974283921
Validar un código postal
Validar una fecha en formato dd/mm/aaaa
Validar un DNI que pueda contener o no los puntos y el -, y la letra en mayúscula o minúscula.
 */
public class Ej1 {
    public static void main(String[] args) {
        //num telefono
        Pattern p = Pattern.compile("^\\\\(\\\\+\\\\d{1,3}\\\\)\\\\d{9}$");
        Matcher m = p.matcher("(+34)639855349");

        if(m.matches()){
            System.out.println("Funciona");
        }else {
            System.out.println("No matchea");
        }

        // codigo postal
        Pattern pcodP = Pattern.compile("^\\d{1,9}\\d{1,9}\\d{1,9}$");
        Matcher mcodP = pcodP.matcher("22400");

        if(mcodP.matches()){
            System.out.println("Funciona");
        }else {
            System.out.println("No matchea");
        }


        //fecha

        Pattern pfecha = Pattern.compile("^\\\\((0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\\\d{4}\\\\)$");
        Matcher mfecha = pfecha.matcher("(22/12/1999)");
        if(mfecha.matches()){
            System.out.println("Funciona");
        }else {
            System.out.println("No matchea");
        }

        //dni
        Pattern pdni = Pattern.compile( "^[0-9]{8}[A-Za-z]$");
        Matcher mdni = pdni.matcher("42358974T");

        if(mdni.matches()){
            System.out.println("Funciona");
        }else {
            System.out.println("No matchea");
        }
    }
}
