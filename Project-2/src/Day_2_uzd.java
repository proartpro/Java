import java.util.Scanner;

public class Day_2_uzd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ievadiet pirmo skaitli: ");
		int a = sc.nextInt();

		System.out.println("Ievadiet otro skaitli: ");
		int b = sc.nextInt();

		sc.close();
		int sum = a + b;

		if (sum > 9 && sum < 20) {
			System.out.println("20");
		}

		else {
			System.out.println(sum);
		}

	}
}
