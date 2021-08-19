package com.def;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {

	public DemoFile() {
		
	}

	public static void main(String[] args) {
	/*	File f=new File("E:\\application\\Sample.txt");
		boolean b1=f.exists();
		if(b1!=true) {
			
			try {
			boolean	b2 = f.createNewFile();
				if(b2==true)
				{
					System.out.println("Directory is created Successfully");
					
				}
				else {
					System.out.println("Direcory created unsuccessfull");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}*/
		try {
			@SuppressWarnings("resource")
			FileWriter fw=new FileWriter("E:\\application\\Sample.txt");
			fw.write("Hello");
			fw.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
