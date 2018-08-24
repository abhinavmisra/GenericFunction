package com.hometask.five;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLOperations extends DirectoryOperations {
	
	public Element addNewTag(File item, Element root, String tagName, Document document) throws IOException	{
		Path path = Paths.get(item.getAbsolutePath());
		BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
		
		Element file=document.createElement(tagName);
		file.setAttribute("created", attr.creationTime().toString().substring(0, 10));
		if(tagName=="file")	{
			file.setAttribute("size", String.valueOf(item.length()));
		}
		else{
			file.setAttribute("size", String.valueOf(getFolderSize(new File(item.getAbsolutePath()))));
		}
		file.setAttribute("name", item.getName());

		root.appendChild(file);
		return file;
	}
	
	public void getDirContents(String name, Element root, Document document) throws IOException	{
		File folder = new File(name);
		File[] listOfFiles=folder.listFiles();
		for(File file : listOfFiles){
			if(file.isDirectory()){
				Element fileElement=addNewTag(file, root, "dir", document);
				getDirContents(file.getAbsolutePath(), fileElement, document);
			}
			else	{
				addNewTag(file, root, "file", document);
			}
		}
	}
}