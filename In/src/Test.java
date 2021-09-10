import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String op;

		Scanner sc = new Scanner(System.in);
		System.out.println("Acepta(S/N): ");
		do {
			
			op = sc.next().toUpperCase();
			System.out.println("Opcion incorrecta(S/N): ");
			
		} while (!(op.equals("N") || op.equals("S")));

		System.out.println(op);

	}

}
