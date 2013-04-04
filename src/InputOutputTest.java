
public class InputOutputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputOutput inputOutput = new InputOutput();
		inputOutput.input();
		
		try {
			inputOutput.checkSign('q');
		}
		catch ( ContainException e ) {
			System.out.println( "Programm wird beendet" );
			return;
		}
		
		try {
			inputOutput.checkLength();
		}
		catch ( LengthException e ) {
			System.out.println( e );
			return;
		}
		
		System.out.println(inputOutput.getInput());
		inputOutput.writeInput();
	}

}
