import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}
}
