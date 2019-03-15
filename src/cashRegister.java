import java.util.Scanner;

public class cashRegister {

	public static void main(String[] args) {

		int price;
		int cashTendered;
		int change;
		
		pricePrompt ();

	}
	public static void pricePrompt() {
		Scanner keyboard = new Scanner(System.in);
		
		int methodPrice;
		
		System.out.println("What is the price of this item?");
		methodPrice = keyboard.nextInt();
		
	}
	public static int amountTendered () {
		Scanner keyboard = new Scanner (System.in);
		
		int methodCashTendered;
		
		System.out.println("How much money did you tender?");
		methodCashTendered = keyboard.nextInt();
	}
	public static void correctAmountTendered () {
		
	}
}
