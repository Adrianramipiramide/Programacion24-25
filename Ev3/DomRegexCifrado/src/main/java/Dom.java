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

public class Dom {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("/home/estudiante/Escritorio/Programacion24-25/Ev3/DomRegexCifrado/read.xml");
            Document document = documentBuilder.parse(file);

            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("proyectoEnergiaSostenible");
            for (int i = 0; i < nodeList.getLength(); i++) {
                NodeList nodoAc = (NodeList) nodeList.item(0);
                Element proyecto = (Element) nodeList.item(i);
                Element nombre = (Element) proyecto.getElementsByTagName("nombre").item(0);
                Element ubicacion = (Element) proyecto;
                Element ciudad = (Element) ubicacion.getElementsByTagName("ciudad").item(0);
                Element provincia = (Element) ubicacion.getElementsByTagName("provincia").item(0);
                Element coordenadas = (Element) ubicacion;
                Element latitud = (Element) coordenadas.getElementsByTagName("latitud").item(0);
                Element longitud = (Element) coordenadas.getElementsByTagName("longitud").item(0);
                Element fechaInicio = (Element) proyecto.getElementsByTagName("fechaInicio").item(0);
                Element presupuesto = (Element) proyecto.getElementsByTagName("presupuesto").item(0);
                presupuesto.getAttribute("moneda");
                Element estado = (Element) proyecto.getElementsByTagName("estado").item(0);

                String nombre1 = nombre.getTextContent();
                Proyecto proyecto1 = new Proyecto(nombre1);
                System.out.println(proyecto1);


            }


        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
