package com.function.generic;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class TestXML {
    public static void main(String[] args) {
        try {

            File fileBooks = new File("C:/Users/Abhinav/Desktop/Books.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fileBooks);
            doc.getDocumentElement().normalize();

            System.out.println("root" + doc.getDocumentElement().getNodeName());
            NodeList nodes = doc.getElementsByTagName("book");
            System.out.println("-----------------");

            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    //System.out.println("price " + getValue("price", element));
                    double price = Double.parseDouble(getValue("price", element));
                    if(price < 30.00) {
                        System.out.println("************ "+getValue("price", element));
                        System.out.println("######## "+((Element) node).getAttribute("category") );
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

        private static String getValue (String tag, Element element){
            NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
            Node node = (Node) nodes.item(0);
            return node.getNodeValue();
        }

}