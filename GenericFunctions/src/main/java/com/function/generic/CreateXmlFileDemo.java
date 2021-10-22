package com.function.generic;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.output.support.AbstractXMLOutputProcessor;
import org.jdom2.output.support.FormatStack;
import org.jdom2.output.support.XMLOutputProcessor;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class CreateXmlFileDemo {

    public static void main(String[] args) {

    try{

        Map<String, String> erp = new HashMap<>();
        erp.put("SAP", "SAPTMP");
        erp.put("DSA", "DSATMP");


        Namespace ns2 = Namespace.getNamespace("ns2", "articleMaster");
        //root element
        Element articleMasterLoadRequest = new Element("articleMasterLoadRequest", ns2);
        articleMasterLoadRequest.setAttribute(new Attribute("erp_id", "SAPAribaLibrary"));
        Document doc = new Document(articleMasterLoadRequest);

        //supercars element
        //Namespace ns2_1 = Namespace.getNamespace("ns2","tes");
        Element externalSystemMappings = new Element("ExternalSystemMappings",ns2);

        //supercars element
        for (String name : erp.keySet()) {
            String tmpName = erp.get(name);
            Element externalSystemMapping = new Element("ExternalSystemMapping", ns2);
            externalSystemMapping.setAttribute(new Attribute("ExternalSystemReferenceInFile",name));
            externalSystemMapping.setAttribute(new Attribute("MappedExternalSystem",tmpName));

            externalSystemMappings.addContent(externalSystemMapping);
        }

        doc.getRootElement().addContent(externalSystemMappings);

        XMLOutputProcessor XMLOUTPUT = new AbstractXMLOutputProcessor() {
            @Override
            protected void printDeclaration(final Writer out, final FormatStack fstack) throws IOException {
                write(out, "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?> ");
                write(out, fstack.getLineSeparator());
            }
        };

        XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat(), XMLOUTPUT);
        xmlOutput.output(doc, System.out);
    } catch(IOException e) {
        e.printStackTrace();
    }
}

}
