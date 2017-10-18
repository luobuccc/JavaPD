import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by 53254 on 2017/10/18 19:32 /JavaPD
 */
public class xmlT {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory bdf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = bdf.newDocumentBuilder();
        File f = new File("H:\\t.xml");
        org.w3c.dom.Document doc = db.parse(f);
        Element root = doc.getDocumentElement();
        NodeList nl = root.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            Node chd = nl.item(i);
            if (chd instanceof Element) {
                Text text = (Text) chd.getFirstChild();
                System.out.println(text);
            }

        }

    }
}
