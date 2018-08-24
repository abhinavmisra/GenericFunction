package com.hometask.five;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;




public class DirectoryContentsToXML extends DirectoryOperations {
	static final String SOURCEXMLFILE="D:\\SourceXML.xml";
	static final String CURRENTDIRECTORY="C:\\Users\\Abhinav_Mishra\\Desktop\\Abhinav\\Abhinav_JVP\\Books";
	static final String OUTPUTFILE="D:/DirectoryContentsToXML.xml";
	
	public static void main(String[] args)	throws SAXException, IOException {

		DOMParser parser=new DOMParser();
		parser.parse(SOURCEXMLFILE);
		Document document=parser.getDocument();
		
		XMLOperations xmlOperations=new XMLOperations();
		
		//String currentDirectory=".";
		String currentDirectory=CURRENTDIRECTORY;
		File folder = new File(currentDirectory);
		File[] listOfFiles=folder.listFiles();
		
		Element root = document.getDocumentElement();
		
		for(File file : listOfFiles){
			if(file.isDirectory()){
				Element fileElement=xmlOperations.addNewTag(file, root, "dir", document);
				xmlOperations.getDirContents(file.getAbsolutePath(), fileElement, document);
			}
			else	{
				xmlOperations.addNewTag(file, root, "file",document);
			}
		}
		OutputFormat format=new OutputFormat(document);
		format.setIndenting(true);
		
		XMLSerializer se = new XMLSerializer(new FileOutputStream( new File(OUTPUTFILE)), format);
		se.serialize(document);
		
		System.out.println("Operation Completed without Errors!");
	}
}