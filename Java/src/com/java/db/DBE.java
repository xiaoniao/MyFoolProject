package com.java.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DBE {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Administrator\\Desktop\\db.txt");

		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

		String string = null;
		while ((string = bufferedReader.readLine()) != null) {

			System.out.println(string.indexOf(" "));
		}

		bufferedReader.close();
	}
}
