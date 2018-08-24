package com.function.generic;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;


class ReadDirectoryWithChildFolder {
	//The following method reads all the contents of the directory including the folders inside the parent folder
    
	static void RecursivePrint(File[] arr,int index,int level) {
        // terminate condition
        if(index == arr.length)
            return;
         
        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");
         
        // for files
        if(arr[index].isFile())
            System.out.println(arr[index].getName());
         
        // for sub-directories
        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");
             
            // recursion for sub-directories
            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }
          
        // recursion for main directory
        RecursivePrint(arr,++index, level);
   }
    //********************************************************************************************
	//The following method reads the contents of the directory.
   /* public void readFile(String filePath) {
		File refFile = new File(filePath);
		try {
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(refFile.list()));
		for(String fileName : names) {
			System.out.println("The content of the directoreis are "+fileName);
		}
		}catch(java.lang.NullPointerException e) {
			System.out.println("The directory doesn't exist");
		}
	}*/
}

public class ReadDirectory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ReadDirectoryWithChildFolder refDir = new ReadDirectoryWithChildFolder();
		refDir.readFile("C:\\Users\\Abhinav_Mishra\\Desktop\\Abhinav\\Abhinav_JVP\\Books");*/
	
	// Provide full path for directory(change accordingly)  
    String maindirpath = "C:\\Users\\Abhinav_Mishra\\Desktop\\Abhinav\\Abhinav_JVP\\Books";
             
    // File object
    File maindir = new File(maindirpath);
      if(maindir.exists() && maindir.isDirectory()) {
        // array for files and sub-directories 
        // of directory pointed by maindir
        File arr[] = maindir.listFiles();
         
        System.out.println("**********************************************");
        System.out.println("Files from main directory : " + maindir);
        System.out.println("**********************************************");
         
        // Calling recursive method
        ReadDirectoryWithChildFolder.RecursivePrint(arr,0,0); 
   } 
	}
}

  