package com.fls;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharRead {
	
	public static void main(String[] args) throws Exception
	{
		
		FileReader fr = new FileReader("src/msg.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
	}

}
