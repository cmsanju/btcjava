package com.fls;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ByteRead {
	
	public static void main(String[] args) throws Exception
	{
		
		File file = new File("src/write.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] br = new byte[1024];
		
		int x = 0;
		
		while((x = bis.read(br)) != -1)
		{
			System.out.println(new String(br, 0, x));
		}
	}

}
