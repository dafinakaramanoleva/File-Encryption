package homework1SDA;

import java.io.IOException;
import java.util.LinkedList;

public class mainClass {
	public static void main(String[] args) throws IOException {
		LinkedList<Character> key = new LinkedList<Character>();
		for(int i = 0; i < 256; i++) {
			key.add((char)i);
		}
		
		FileEncoder61695 result = new FileEncoder61695();
		result.encode("C:/Users/Dafiii/Desktop/test_input.bin", "C:/Users/Dafiii/Desktop/test_ouput.bin", key);
	}
}
