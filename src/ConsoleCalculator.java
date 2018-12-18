import acm.program.ConsoleProgram;

public class ConsoleCalculator extends ConsoleProgram{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		
		//start console
		while(true) {
			//display menu
			title();
			menu();
			//read input
			int input = readInt("Enter option :");
			
			//validate
			if(input == 0) break;
		}
	}
	
	public void title() {
		println("Calculator 1.0");
		println();
	}
	
	public void menu() {
		println("1. Expression Calculator");
		println("2. Volume Converter");
		println("3. Temperature Converter");
		println("5. Mass Calculator");
		println("6. Multiples Calculator");
		println("7. Factors Calculator");
		println("0. Exit");
		println();
	}
}
