import java.util.*;
//Pair programming assignment.  COde accepts a string of numbers from the user.  
//It then prints the smallest and largest number
//It also prints the sum of all the even numbers and the largest even number entered by the user.
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you wish to enter?");
		int numValues = userInput.nextInt();
		System.out.println("Enter your first integer");
		int number = userInput.nextInt();
		int max = number;
		int min = number;
		int evensSum = 0;
		int minEven;
		int maxEven = Integer.MIN_VALUE;
		boolean foundEven = false;
		if (number%2 == 0) {
			foundEven = true;
			maxEven = number;
			evensSum +=number;
		}
		
		for (int i = 1; i < numValues; i++) {
			System.out.println("Enter your next integer");
			number = userInput.nextInt();
			if (number%2 == 0) {
				if (!foundEven) {
					foundEven = true;
				}
				if(number > maxEven) {
					maxEven = number;
				}
				evensSum +=number;
			}
			if (number < min) {
				min = number;
			} else if (number > max) {
				max = number;
			}
		}
		System.out.println("The smallest number input is: "+min);
		System.out.println("The largest number input is: "+max);
		if (foundEven){
			System.out.println("The largest even number input is: "+maxEven);
			System.out.println("The sum of the evens is: "+evensSum);
		} else {
			System.out.println("No evens entered");
		}
		userInput.close();
	}
}
