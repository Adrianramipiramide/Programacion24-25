/*
Crea un programa que obtenga los datos meteorológicos de la localidad que quieras y calcule cuántas horas
en la siguiente semana van a tener una probabilidad de precipitación mayor o igual al 70% y cuantas horas tienen una probabilidad
menor del 30%. Utiliza la información de la web de AEMET (y los bloques horarios que más te convengan).
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Ej5LecturaAemet {
    public static void main(String[] args) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            File file = new File("C:\\Users\\Usuario\\Desktop\\Programacion24-25\\Ev3\\DomRegexCifrado\\aemet.xml");
            Document document = documentBuilder.parse(file);


            Element root = document.getDocumentElement();
            NodeList dias = document.getElementsByTagName("dia");
            //Horas con mas de 70% probabilidades de lluvia y menos de 30% de probabilidades
            int numHorasMas70 = 0;
            int horasMenor30 = 0;

            for (int i = 0; i < dias.getLength(); i++) {
                Element dia = (Element) dias.item(i);
                NodeList probabilidades = dia.getElementsByTagName("prob_precipitacion");

                for (int j = 0; j < probabilidades.getLength(); j++) {
                    Element probabilidad = (Element) probabilidades.item(j);
                    String periodo = probabilidad.getAttribute("periodo");
                    String valorTexto = probabilidad.getTextContent();

                    if (!valorTexto.isEmpty()) {
                        int valor = Integer.parseInt(valorTexto);
                        int horas = calcularHoras(periodo);

                        if (valor >= 70) {
                            numHorasMas70 += horas;
                        } else if (valor < 30) {
                            horasMenor30 += horas;
                        }
                    }
                }
            }

            System.out.println("Horas con probabilidad de lluvia > 70%: " + numHorasMas70);
            System.out.println("Horas con probabilidad de lluvia < 30%: " + horasMenor30);

        }catch(Exception e) {
            e.printStackTrace();
        }

    }
    private static int calcularHoras(String periodo) {

        String[] partes = periodo.split("-");
        if (partes.length == 2) {
            int inicio = Integer.parseInt(partes[0]);
            int fin = Integer.parseInt(partes[1]);
            return fin - inicio;
        }
        return 0;
    }
}
