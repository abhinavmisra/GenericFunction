package com.hometask.five;

import java.io.File;

public class DirectoryOperations {
	
	public long getFolderSize(File directory) {
	    long length = 0;
	    for (File file : directory.listFiles()) {
	        if (file.isFile())
	            length += file.length();
	        else
	            length += getFolderSize(file);
	    }
	    return length;
	}
}