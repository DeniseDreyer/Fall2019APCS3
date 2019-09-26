import java.util.*;

public class QuadraticClient {

	public static void main(String[] args) {
	
		//set up the scanner
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for the coeficients a, b and c.");
		System.out.println();
		String again = "";
		while (!again.equalsIgnoreCase("quit")) {
		
			//read the input
			System.out.print("a: ");
			double a =userInput.nextDouble();
			System.out.print("b: ");
			double b =userInput.nextDouble();
			System.out.print("c: ");
			double c =userInput.nextDouble();
		
			//call quadraDescriber and send it the inputs
			String description = Quadratic.quadrDescriber (a,b,c);
			//print out the string returned my quadrDescriber
			System.out.println(description);
			//ask if they want to go again --> loop or quit
			System.out.print("Do you want to go again?");
			again = userInput.next();
		}
		userInput.close();
	}

}
