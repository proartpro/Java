import java.util.Scanner;
public class Uzdevums1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ievadiet pirmo skaitli: ");
		int a = sc.nextInt();
		
		System.out.println("Ievadiet otro skaitli: ");
		int b = sc.nextInt();
		
		sc.close();
		int sum = a + b;
		
		System.out.println("Summa ir: " + sum);

	}

}
