package com.function.generic;

import java.io.File;
import java.io.IOException;

public class FileRename {
	
	public static void main(String[] args) throws IOException
    {

        String folder_path =
               "D:\\Radian";
 
       
        File myfolder = new File(folder_path);
 
        File[] file_array = myfolder.listFiles();
        int j = 1;
        for (int i = 0; i < file_array.length; i++)
        {
 
            if (file_array[i].isFile())
            {
                File myfile = new File(folder_path +
                         "\\" + file_array[i].getName());
                String long_file_name = file_array[i].getName();
                String new_file_name = "Parallel6_";
                String formattedNum = String.format("%03d", j);
                myfile.renameTo(new File(folder_path+"\\"+ new_file_name+formattedNum+ ".xml"));
                j++;
            }
        }
    }
}
