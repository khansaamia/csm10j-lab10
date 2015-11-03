package checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

	public static void OpenFileChecked () throws IOException,FileNotFoundException 
	{
		FileReader filereader=new FileReader("\\nofile.txt");
		
		try {
			filereader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new IOException();
		}
	}

}
