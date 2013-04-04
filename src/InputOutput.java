import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
	String userInput;
	
	InputOutput()
	{
		this.userInput = null;
	}
	
	public void input() 
	{
		Scanner scanner = new Scanner( System.in );
		this.userInput =  scanner.nextLine();
		scanner.close();
	}
	
	public String getInput()
	{
		return this.userInput;
	}
	
	public int checkLength() throws LengthException
	{
		if( this.userInput.length() < 5) 
			throw new LengthException("Zeichenkette zur kurz");
		return this.userInput.length();
	}
	
	public void checkSign( char sign_ ) throws ContainException
	{
		if ( this.userInput.indexOf( sign_ ) >=  0 ) 
			throw new ContainException("Programm wird beendet!");
	}
	
	public void writeInput()
	{
		String fileName = "userinput.txt";
		String workingDir = System.getProperty("user.dir");
		String finalFile = workingDir + File.separator + fileName;
		
		PrintWriter printWriter = null;
		try {
			File file = new File( finalFile );
			if ( !file.exists() ) file.createNewFile();
			
			printWriter = new PrintWriter ( new BufferedWriter ( new FileWriter (file, true)) );
			
			printWriter.println( this.userInput );
			printWriter.close();
			
		}
		catch ( IOException e ) {
			e.printStackTrace();
		}
	}
}
