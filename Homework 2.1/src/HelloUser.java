import java.util.Scanner;

public class HelloUser {

//Homework

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi vardu un uzvardu: ");
		String input = scanner.nextLine();

		input = input.trim();
		int index = input.indexOf(" ");
		System.out.println("index: " + index);

		String firstname = input;
		if (index > 0) {
		 firstname = input.substring(0, index);
		}
		
		firstname = 
				firstname.substring(0, 1).toUpperCase() + 
				firstname.substring(1).toLowerCase();
		System.out.println("'" + firstname + "'");

		if (index > 0) {
			String lastname = input.substring(index).trim().toUpperCase();
			System.out.println("'" + lastname + "'");
		} else {
			System.out.println();
		}

		scanner.close();

	}

}
