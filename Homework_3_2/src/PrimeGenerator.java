import java.util.Scanner;

public class PrimeGenerator {
	
	public static boolean isPrime(int x) {
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentNum = 2;
		int primes = 0;
		
		System.out.print("Cik pirmsskaitlus velies genereet: ");
		int cikReizes = sc.nextInt();
		sc.close();
		
		while (primes < cikReizes) {
			if (isPrime(currentNum)) {
				primes++;
				
				System.out.print(currentNum + ", ");
			}
			currentNum++;
		}
	}

}