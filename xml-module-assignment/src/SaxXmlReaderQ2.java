import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxXmlReaderQ2 {
	private static final String STUDENT_XML = "C:\\Users\\nitish.gupta_spicemo\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE-practice\\xml-module-assignment\\xmls\\Student.xml";

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		try {
			File inputFile = new File(STUDENT_XML);
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler userhandler = new UserHandler();
			saxParser.parse(inputFile, userhandler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class UserHandler extends DefaultHandler {

	boolean bId = false;
	boolean bName = false;
	boolean bStd = false;
	boolean bGender = false;
	boolean bMarks = false;
	boolean bAddress = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("id")) {
			bId = true;
		} else if (qName.equalsIgnoreCase("name")) {
			bName = true;
		} else if (qName.equalsIgnoreCase("std")) {
			bStd = true;
		} else if (qName.equalsIgnoreCase("gender")) {
			bGender = true;
		} else if (qName.equalsIgnoreCase("marks")) {
			bMarks = true;
		} else if (qName.equalsIgnoreCase("address")) {
			bAddress = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

//		if (qName.equalsIgnoreCase("student")) {
//			System.out.println("End Element :" + qName);
//		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bId) {
			System.out.println("Id: " + new String(ch, start, length));
			bId = false;
		} else if (bName) {
			System.out.println("Name: " + new String(ch, start, length));
			bName = false;
		} else if (bStd) {
			System.out.println("Std: " + new String(ch, start, length));
			bStd = false;
		} else if (bMarks) {
			System.out.println("Marks: " + new String(ch, start, length));
			bMarks = false;
		} else if (bGender) {
			System.out.println("Gender: " + new String(ch, start, length));
			bGender = false;
		} else if (bAddress) {
			System.out.println("Address: " + new String(ch, start, length));
			bAddress = false;
		}
	}
}