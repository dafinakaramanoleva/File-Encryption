package homework1SDA;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;

public class FileEncoder61695 {
	int character = 0;
	int i = 0;
	
	public boolean isPrime(int n) {
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
    public void encode(String sourceFile, String destinationFile, LinkedList<Character> key) throws IOException {
    	
    	InputStream inputFile = new FileInputStream(sourceFile);
    	OutputStream resultFile = new FileOutputStream(destinationFile);
    	
    	while((character = inputFile.read()) != -1) {
    		if(!isPrime(i))
    			resultFile.write(key.get(character));
    		else
    			resultFile.write(character);
    		i++;
    	}
    	
    	inputFile.close();
    	resultFile.close();
    }
    
    public void decode(String encodedFile, String destinationFile, LinkedList<Character> key) throws IOException {
    	
    	InputStream inputFile = new FileInputStream(encodedFile);
    	OutputStream resultFile = new FileOutputStream(destinationFile);
    	
    	while((character  = inputFile.read())!= -1) {
    		if(!isPrime(i))
    			resultFile.write(key.indexOf(character));
    		else
    			resultFile.write(character);
    		i++;
    	}
    	
    	inputFile.close();
    	resultFile.close();
    }
}
