package com.skillogic.exceptionhandling.compiletime;

import java.io.File;
import java.io.FileInputStream;

public class ReadData {
    public void readFile() {
    	File f = new File("D:/a.txt");
    	FileInputStream fis  = new FileInputStream(f);
    }
	public static void main(String[] args) {
		
	}
}
