package com.function.generic;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DirectoryToXML {
	
	private static void createXML(String xmlFilePath, String xmlfilename) throws Exception {

		// initiating document factory
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element rootElement = document.createElement("Folder");
		document.appendChild(rootElement);

		// Assign the path to find the dirs and files
		File path = new File("C:\\Users\\Abhinav_Mishra\\Desktop\\Abhinav\\Abhinav_JVP\\Books");

		rootElement.setAttribute("Value", path.getName());

		// First call to explore the path using recursive
		listDirectories(rootElement, document, path);

		// Result output mechanism
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(new File(xmlFilePath+"\\"+xmlfilename+".xml"));
		transformer.transform(source, result);
		}

		private static void listDirectories(Element rootElement, Document document,
		File dir) throws Exception {

		for (File f : dir.listFiles()) {
			if (f.isDirectory()) { // is it a directory?
				Element childElement = document.createElement("Folder");
				childElement.setAttribute("value", f.getName());
				rootElement.appendChild(childElement);

		// Recurssive call to the same method where we find any folder
		// in parent folder
		listDirectories(childElement, document, f.getAbsoluteFile());

		} else {
		Element childElement = document.createElement("File");
		childElement.setAttribute("value", f.getName());
		rootElement.appendChild(childElement);
		}
		}
	}



	public static void main(String[] args) throws ParserConfigurationException, Exception {
		// TODO Auto-generated method stub
		DirectoryToXML.createXML("D://","DirectoryToXML");
		System.out.println("The file is successfully written");
	}

}
