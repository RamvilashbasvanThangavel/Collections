package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimePractice01 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Ramvilashbasvan Than\\OneDrive\\Desktop\\text.txt");
		FileReader fr = new FileReader(f);
		int temp = 0;
		while ((temp = fr.read()) != -1) {
			System.out.print((char) (temp));
		}
	} 

}
