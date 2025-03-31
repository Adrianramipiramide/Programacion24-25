import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/*
Crea un programa que genere como salida un archivo XML que contenga los datos de una biblioteca
(puedes recurrir a algunas de las clases que desarrollaste en unidades anteriores).
 */
public class Ej3 {
    public static void main(String[] args) {


        ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

        Biblioteca biblioteca1 = new Biblioteca("Monzón","Ramon J Sender", 345,2);
        Biblioteca biblioteca2 = new Biblioteca("Huesca","Julio Cesar", 455,4);

        bibliotecas.add(biblioteca1);
        bibliotecas.add(biblioteca2);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("/home/estudiante/Escritorio/Programacion24-25/Ev3/DomRegexCifrado/Biblioteca.xml");
            Document document = documentBuilder.newDocument();


            Element root = document.createElement("Biblioteca");
            document.appendChild(root);
            for (Biblioteca biblioteca : bibliotecas){
                Element nombre = document.createElement("nombre");
                root.appendChild(nombre);
                nombre.setTextContent(biblioteca.nombre);
                Element Localidad = document.createElement("localidad");
                root.appendChild(Localidad);
                Localidad.setTextContent(biblioteca.getLocalidad());
                Element numLibros = document.createElement("numLibros");
                root.appendChild(numLibros);
                numLibros.setTextContent(String.valueOf(biblioteca.getNumLibros()));
                Element bibliotecarios = document.createElement("bibliotecarios");
                root.appendChild(bibliotecarios);
                bibliotecarios.setTextContent(String.valueOf(biblioteca.getBibliotecarios()));

            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
