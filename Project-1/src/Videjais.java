import java.util.Scanner;
public class Videjais {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Ievadiet pirmo skaitli: ");
        double x = in.nextDouble();
        System.out.print("Ievadiet otro skaitli: ");
        double y = in.nextDouble();
        System.out.print("Ievadiet treso skaitli: ");
        double z = in.nextDouble();
        System.out.print("Videjais " + average(x, y, z)+"\n" );
    	in.close();

    }


	
  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }

}