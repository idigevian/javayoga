package workingWithFiles;
import java.io.*;
import java.util.*;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		if(args.length > 0) {
				Scanner reader = new Scanner(new FileInputStream(args[0]));
			
				while (reader.hasNext()) {      // while there is another token to read
					String line = reader.next(); 
					System.out.println(line);
				}
				
		} 
			
		// TODO Auto-generated method stub
	
		}
	}
