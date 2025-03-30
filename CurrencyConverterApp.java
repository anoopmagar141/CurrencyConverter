import java.util.HashMap;
import java.util.Scanner;


// Main class
public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter source currency (e.g., USD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g., USD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        try {
           
            System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
