package org.temp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Indium {

	public static void main(String[] args) throws IOException {
		
		DataOutputStream d = new DataOutputStream(new FileOutputStream("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\Ex.xlsx"));
		d.writeUTF("hello");
		
		DataInputStream d1 = new DataInputStream(new FileInputStream("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\Ex.xlsx"));
		
		while (d1.available()>0) {
			
			String text = d1.readUTF();
			System.out.println(text);
		}

	}

}
