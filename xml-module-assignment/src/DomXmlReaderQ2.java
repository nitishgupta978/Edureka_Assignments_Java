import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomXmlReaderQ2 {
	private static final String STUDENT_XML = "C:\\Users\\nitish.gupta_spicemo\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE-practice\\xml-module-assignment\\xmls\\Student.xml";

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		try {
			File inputFile = new File(STUDENT_XML);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("student");
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Student id : " + eElement.getElementsByTagName("id").item(0).getTextContent());
					System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("std : " + eElement.getElementsByTagName("std").item(0).getTextContent());
					System.out.println("gender : " + eElement.getElementsByTagName("gender").item(0).getTextContent());
					System.out.println(" marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
					System.out
							.println("address : " + eElement.getElementsByTagName("address").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
