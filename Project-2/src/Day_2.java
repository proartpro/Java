import java.util.Scanner;

public class Day_2 {

	public static void main(String[] args) {
		System.out.println("Ievadiet kadu vardu: ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		System.out.println("Tu ievadiji:  '" + name + "'");
		
		System.out.println("Ievadi veselu skaitli: ");
		int number = scanner.nextInt();
		System.out.println("Tu ievadiji skaitli:  '" + number + "'");
		
		System.out.println("Ievadi skaitli: ");
		double doubleNumber = scanner.nextDouble();
		System.out.println("Tu ievadiji decimalskaitli:  '" + doubleNumber + "'");
		
		scanner.close();
	}

}
