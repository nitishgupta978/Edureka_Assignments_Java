import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DomXmlWriterQ3 {
	private static final String OUTPUT_FOLDER_PATH="C:\\Users\\nitish.gupta_spicemo\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE-practice\\xml-module-assignment\\xmls\\output\\Employee.xml";
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			Element rootElement = doc.createElement("Employee");
			doc.appendChild(rootElement);

			Element empId = doc.createElement("Emp_id");
			empId.appendChild(doc.createTextNode("101"));
			rootElement.appendChild(empId);

			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode("Nitish Gupta"));
			rootElement.appendChild(name);

			Element dept = doc.createElement("Dept");
			dept.appendChild(doc.createTextNode("IT"));
			rootElement.appendChild(dept);

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(OUTPUT_FOLDER_PATH));
			transformer.transform(source, result);

			StreamResult consoleResult = new StreamResult(System.out);
			transformer.transform(source, consoleResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
