package chapter1;

import java.io.File;

public class Exercise2 {
	public static void main(String[] args) {
		if (args.length < 1) {
			return;
		}
		String dirPath = args[0];
		File dir = new File(dirPath);
		
		File[] dirs = dir.listFiles(file -> 
			file.isDirectory()
		);
		for (File f : dirs) {
			System.out.println(f.getName());
		}
	}
}
