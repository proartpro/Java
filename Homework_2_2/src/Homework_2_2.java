import java.util.Scanner;
public class Homework_2_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] meneshi = {null, 
				"janvaris", 
				"februaris", 
				"marts", 
				"aprilis", 
				"maijs", 
				"junijs", 
				"julijs", 
				"augusts", 
				"septembris", 
				"oktobris", 
				"novembris", 
				"decembris"
				};
		
		
		System.out.print("Ievadiet menesa datumu(1-31): ");
		int datums = scanner.nextInt();				
				
		System.out.print("Ievadiet menesa numuru(1-12): ");
		int menesis = scanner.nextInt();
		while(menesis < 1 || menesis > 12) {
			System.out.print("Ievadiet eksistejosu menesi (1-12)!");
			menesis = scanner.nextInt();
		}
		
		System.out.println("Ievadiet gadu: ");
		int gads = scanner.nextInt();
		scanner.close();
		
		if ((menesis == 1 || menesis == 3 || menesis == 5 || menesis == 7 
			|| menesis == 8 || menesis == 10 || menesis == 12) && (datums > 31 || datums < 1)) {
			System.out.println(datums + "." + meneshi[menesis] + " neeksiste!");
		}else if ((menesis == 4 || menesis == 6 || menesis == 9 || menesis == 11) && (datums < 1 || datums > 30)) {			
			System.out.println(datums + "." +meneshi[menesis] + " neeksiste!");
		}else if ((menesis == 2 && gads % 4 == 0) && (datums < 1 || datums > 29)) {		//year % 4 != 0 (common year)
			System.out.println(gads + ". gada " + datums + "." + meneshi[menesis] + " neeksiste!");
		}else if ((menesis == 2 && gads % 4 != 0) && (datums < 1 || datums > 28)) {
			System.out.println(datums + "." + meneshi[menesis] + " neeksiste!");
		}else {
			System.out.println(datums + "." + meneshi[menesis]);
		}
	}
}