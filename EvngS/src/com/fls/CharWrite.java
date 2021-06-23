package com.fls;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CharWrite {
	
	public static void main(String[] args) throws Exception
	{
		
		FileWriter fw = new FileWriter("src/msg.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		String msg = "This is the example for char stream write operation";
		
		bw.write(msg);
		
		bw.flush();
		
		System.out.println("Done.");
	}

}
