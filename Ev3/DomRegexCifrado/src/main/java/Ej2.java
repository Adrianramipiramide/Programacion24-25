/*
En el archivo empleados.xml hay una serie de empleados. El objetivo es disponer de esa información en un
programa java para poder trabajar con objetos en lugar de un archivo.
Una vez importado de una manera correcta, se mostrará la información de todos los empleados.
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ej2 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            File file = new File("/home/estudiante/Escritorio/Programacion24-25/Ev3/DomRegexCifrado/empleados.xml");
            Document document = documentBuilder.parse(file);


            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("empleado");
            for (int i = 0; i < nodeList.getLength(); i++) {
                NodeList nodeList1 = nodeList;
                Element empleado = (Element)nodeList.item(i);
                Element id = (Element) empleado.getElementsByTagName("id").item(0);
                Element apellido=(Element) empleado.getElementsByTagName("apellido").item(0);
                Element dep = (Element) empleado.getElementsByTagName("dep").item(0);
                Element salario = (Element) empleado.getElementsByTagName("salario").item(0);

                String id1 = id.getTextContent();
                String apellido1 = apellido.getTextContent();
                int dep1 = Integer.parseInt(dep.getTextContent());
                double salario1 = Double.parseDouble(salario.getTextContent());

                Empleados empleados1 = new Empleados(id1,apellido1,dep1,salario1);
                System.out.println(empleados1);


            }



        }catch(IOException e){
            System.out.println("Mistake");
        }catch(SAXException e){
            System.out.println("SAX ERROR");
        }catch (ParserConfigurationException e){
            System.out.println("Parse Error");
        }
    }
}
