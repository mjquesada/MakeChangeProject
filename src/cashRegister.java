import java.util.Scanner;

public class cashRegister {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean continueShopping;
		String keepShopping;

		do {

			double price = pricePrompt();
			double cashTendered = amountTendered();
			
			if (correctPriceChange(price, cashTendered)) {
				changeCalculations(price, cashTendered);
			}
			
			System.out.println("Would you like to keep shopping (Yes or No)?");
			keepShopping = keyboard.next();
			
			if (keepShopping.equalsIgnoreCase("Yes")) {
				continueShopping = true;
			}
			else {
				continueShopping = false;
			}
			
		} while (continueShopping);
		
		keyboard.close();
	}

	public static double pricePrompt() {
		Scanner keyboard = new Scanner(System.in);

		double methodPrice;
		System.out.println("What is the price of this item?");
		methodPrice = keyboard.nextDouble();
		return methodPrice;
	}

	public static double amountTendered() {
		Scanner keyboard = new Scanner(System.in);

		double methodCashTendered;
		System.out.println("How much money did you tender?");
		methodCashTendered = keyboard.nextDouble();
		return methodCashTendered;
	}

	public static boolean correctPriceChange(double price, double cashTendered) {

		if (price == cashTendered) {
			System.out.println("The price is equal to cash tendered");
			return false;
		} else if (price > cashTendered) {
			System.out.println("The price is more than you provided");
			return false;
		} else {
			return true;
		}
	}

	public static void changeCalculations(double price, double cashTendered) {

		double change;
		double count = 0;

		change = (cashTendered - price);
		System.out.printf("Your total change is: $%.2f", change);
		System.out.println();

		while (change > 10) {

			change -= 10;
			count++;
		}
		System.out.println("10 dollar bills returned: " + count);
		System.out.printf("\nI still owe you $%.2f", change);
		System.out.println();
		count = 0;

		while (change > 5) {

			change -= 5;
			count++;
		}
		System.out.println("5 dollar bills returned: " + count);
		System.out.println("I still owe you $" + change);
		System.out.println();
		count = 0;

		while (change > 1) {

			change -= 1;
			count++;
		}
		System.out.println("1 dollar bills returned: " + count);
		System.out.println("I still owe you $" + change);
		System.out.println();
		count = 0;

		while (change > .25) {

			change -= 0.25;
		}
		System.out.println("Quarters returned: " + count);
		System.out.println("I still owe you $" + change);
		System.out.println();
		count++;

		while (change > .10) {

			change -= 0.10;
		}
		System.out.println("Dimes returned: " + count);
		System.out.println("I still owe you $" + change);
		System.out.println();
		count++;

		while (change > .05) {

			change -= 0.05;
			count++;
		}
		System.out.println("Nickles returned: " + count);
		System.out.println("I still owe you $" + change);
		System.out.println();
		count++;

		while (change > .01) {

			change -= 0.01;
		}
		System.out.println("Pennies returned: " + count);
		System.out.println("I still owe you $" + change);
		System.out.println();
		count++;
	}
}
