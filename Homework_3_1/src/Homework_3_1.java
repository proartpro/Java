import java.util.Scanner;
import java.util.Random;

public class Homework_3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ievadiet masivu robezaa 20 - 40: ");
		int izmers = sc.nextInt();
		while (izmers < 20 || izmers > 40) {
			System.out.println("Izmeram jaabuut 20 - 40 !");
			izmers = sc.nextInt();
			
		}
		sc.close();
		Random rnd = new Random();
		int skaitlis = 0;
		
		int[] masivsRandomSkaitli = new int[izmers];
		
		for (int i = 0; i < izmers; i++) {
			
			masivsRandomSkaitli[i] = rnd.nextInt(90) + 10;
			System.out.print(masivsRandomSkaitli[i] + ", ");
		}
		

		for (int i = 0; i < izmers; i++) {
			for (int j = i + 1; j < izmers; j++) {
				if (masivsRandomSkaitli[i] > masivsRandomSkaitli[j]) {
						skaitlis = masivsRandomSkaitli[i];
						masivsRandomSkaitli[i] = masivsRandomSkaitli[j];
						masivsRandomSkaitli[j] = skaitlis;
						
				}
			}
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < izmers; i++) {
			System.out.print(masivsRandomSkaitli[i] + ", ");
		}
	}
}