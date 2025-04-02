import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/*
Crea un programa que tome los datos del archivo empleados y genere otro en el que los salarios aparezcan con un aumento del 12%.
 */
public class Ej4 {
    public static void main(String[] args) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    try{
        DocumentBuilder db = dbf.newDocumentBuilder();
        File file = new File("/home/estudiante/Escritorio/Programacion24-25/Ev3/DomRegexCifrado/empleados.xml");
        Document document = db.newDocument();

        Element root = document.createElement("empleado");
        for (int i = 0; i < ; i++) {
            
        }

        TransformerFactory tsf = TransformerFactory.newDefaultInstance();
        Transformer ts = tsf.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(file);

    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
