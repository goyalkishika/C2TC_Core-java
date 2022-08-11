package com.acharya.exception;

import java.io.FileInputStream;
import java.io.IOException;
public class ex5 {
public static void main(String[] args) throws {
    FileInputStream fis = null;
    fis = new FileInputStream("D:/myfile.txt"); 
    int k; 
    while(( k = fis.read() ) != -1) 
        { 
	System.out.print((char)k); 
		} 
    fis.close();
	}


}
