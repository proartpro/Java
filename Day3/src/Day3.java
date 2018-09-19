import java.util.Random;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ievadi skaitli: ");
//		int a = sc.nextInt();
		Random rnd = new Random();
		int a = rnd.nextInt(10);
		a = a - 5;
		System.out.println("Skaitlis =  " + a);

		// cikls
		System.out.print("" + a + " -> ");

		int from = 0;
		int to = a;

		if (a < 0) {
			from = a;
			to = 0;
		}

		for (int i = from; i <= to; i++) {
			if(i == to) {
			System.out.print("" + i );
			} else {
			System.out.print("" + i + " ,");
			}
		}

//		sc.close();

	}

}
