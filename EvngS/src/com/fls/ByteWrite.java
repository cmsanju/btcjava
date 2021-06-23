package com.fls;

import java.io.File;
import java.io.FileOutputStream;

public class ByteWrite {
	
	public static void main(String[] args) throws Exception
	{
		
		File file = new File("src/write.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		String msg = "This is file handling example using byte stream";
		
		fos.write(msg.getBytes());
		
		System.out.println("Done.");
	}

}
