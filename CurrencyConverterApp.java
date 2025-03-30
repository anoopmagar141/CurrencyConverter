import java.util.HashMap;
import java.util.Scanner;

// CurrencyConverter class (Encapsulation & Abstraction)
class CurrencyConverter {
    private final HashMap<String, Double> exchangeRates;

    // Constructor initializes exchange rates
    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        loadExchangeRates();
    }


    // Method to convert currency
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency code!");
        }
        double baseAmount = amount / exchangeRates.get(fromCurrency);
        return baseAmount * exchangeRates.get(toCurrency);
    }
}

// Main class
public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter source currency (e.g., USD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g., USD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
            System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
