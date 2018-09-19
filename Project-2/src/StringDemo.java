import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		String modified = str.toUpperCase();
		System.out.println(modified);
		System.out.println(str);
		String mod = str.trim();

		sc.close();
		
		System.out.println("'" + mod + "'");
	}

}
