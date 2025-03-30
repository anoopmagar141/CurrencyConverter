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

    // Method to load exchange rates (can be updated manually or via API)
    private void loadExchangeRates() {
exchangeRates.put("USD", 1.0); // Base currency
exchangeRates.put("EUR", 0.91);    // Euro (Eurozone)
exchangeRates.put("GBP", 0.78);    // British Pound (United Kingdom)
exchangeRates.put("INR", 83.27);   // Indian Rupee (India)
exchangeRates.put("JPY", 151.85);  // Japanese Yen (Japan)
exchangeRates.put("CNY", 7.22);    // Chinese Yuan (China)
exchangeRates.put("AUD", 1.52);    // Australian Dollar (Australia)
exchangeRates.put("CAD", 1.35);    // Canadian Dollar (Canada)
exchangeRates.put("NPR", 132.50);  // Nepalese Rupee (Nepal)
exchangeRates.put("CHF", 0.89);    // Swiss Franc (Switzerland)
exchangeRates.put("SGD", 1.34);    // Singapore Dollar (Singapore)
exchangeRates.put("HKD", 7.84);    // Hong Kong Dollar (Hong Kong)
exchangeRates.put("SEK", 10.48);   // Swedish Krona (Sweden)
exchangeRates.put("NZD", 1.67);    // New Zealand Dollar (New Zealand)
exchangeRates.put("KRW", 1320.75); // South Korean Won (South Korea)
exchangeRates.put("BRL", 4.98);    // Brazilian Real (Brazil)
exchangeRates.put("ZAR", 18.52);   // South African Rand (South Africa)
exchangeRates.put("RUB", 92.34);   // Russian Ruble (Russia)
exchangeRates.put("MXN", 17.20);   // Mexican Peso (Mexico)
exchangeRates.put("IDR", 15950.0); // Indonesian Rupiah (Indonesia)
exchangeRates.put("TRY", 32.55);   // Turkish Lira (Turkey)
exchangeRates.put("SAR", 3.75);    // Saudi Riyal (Saudi Arabia)
exchangeRates.put("AED", 3.67);    // United Arab Emirates Dirham (UAE)
exchangeRates.put("THB", 36.50);   // Thai Baht (Thailand)
exchangeRates.put("MYR", 4.69);    // Malaysian Ringgit (Malaysia)
exchangeRates.put("PKR", 278.90);  // Pakistani Rupee (Pakistan)
exchangeRates.put("EGP", 30.87);   // Egyptian Pound (Egypt)
exchangeRates.put("BDT", 109.50);  // Bangladeshi Taka (Bangladesh)
exchangeRates.put("VND", 24650.0); // Vietnamese Dong (Vietnam)
exchangeRates.put("PLN", 3.98);    // Polish Zloty (Poland)
exchangeRates.put("CZK", 23.12);   // Czech Koruna (Czech Republic)
exchangeRates.put("HUF", 351.47);  // Hungarian Forint (Hungary)
exchangeRates.put("DKK", 6.84);    // Danish Krone (Denmark)
exchangeRates.put("ILS", 3.72);    // Israeli Shekel (Israel)
exchangeRates.put("ARS", 880.50);  // Argentine Peso (Argentina)
exchangeRates.put("CLP", 926.15);  // Chilean Peso (Chile)
exchangeRates.put("COP", 3912.75); // Colombian Peso (Colombia)
exchangeRates.put("PEN", 3.78);    // Peruvian Sol (Peru)
exchangeRates.put("NGN", 1380.45); // Nigerian Naira (Nigeria)
exchangeRates.put("KWD", 0.31);    // Kuwaiti Dinar (Kuwait)
exchangeRates.put("BHD", 0.38);    // Bahraini Dinar (Bahrain)
exchangeRates.put("OMR", 0.39);    // Omani Rial (Oman)
exchangeRates.put("QAR", 3.64);    // Qatari Riyal (Qatar)
exchangeRates.put("LKR", 303.50);  // Sri Lankan Rupee (Sri Lanka)
exchangeRates.put("MAD", 10.25);   // Moroccan Dirham (Morocco)
exchangeRates.put("DZD", 136.70);  // Algerian Dinar (Algeria)
exchangeRates.put("UAH", 38.75);   // Ukrainian Hryvnia (Ukraine)
exchangeRates.put("BGN", 1.79);    // Bulgarian Lev (Bulgaria)
exchangeRates.put("RON", 4.92);    // Romanian Leu (Romania)
exchangeRates.put("KES", 134.25);  // Kenyan Shilling (Kenya)
exchangeRates.put("TZS", 2550.0);  // Tanzanian Shilling (Tanzania)
exchangeRates.put("UGX", 3850.0);  // Ugandan Shilling (Uganda)
exchangeRates.put("GHS", 14.25);   // Ghanaian Cedi (Ghana)
exchangeRates.put("ETB", 56.75);   // Ethiopian Birr (Ethiopia)
exchangeRates.put("XAF", 600.50);  // Central African CFA Franc (Central Africa)
exchangeRates.put("XOF", 600.50);  // West African CFA Franc (West Africa)
exchangeRates.put("MUR", 45.50);   // Mauritian Rupee (Mauritius)
exchangeRates.put("BWP", 14.75);   // Botswana Pula (Botswana)
exchangeRates.put("ZMW", 24.95);   // Zambian Kwacha (Zambia)
exchangeRates.put("NAD", 18.52);   // Namibian Dollar (Namibia)
exchangeRates.put("SYP", 2500.0);  // Syrian Pound (Syria)
exchangeRates.put("IQD", 1310.0);  // Iraqi Dinar (Iraq)
exchangeRates.put("AFN", 74.75);   // Afghan Afghani (Afghanistan)
exchangeRates.put("MNT", 3450.0);  // Mongolian Tugrik (Mongolia)
exchangeRates.put("KZT", 458.75);  // Kazakhstani Tenge (Kazakhstan)
exchangeRates.put("UZS", 12550.0); // Uzbekistani Som (Uzbekistan)
exchangeRates.put("KHR", 4100.0);  // Cambodian Riel (Cambodia)
exchangeRates.put("MMK", 3200.0);  // Myanmar Kyat (Myanmar)
exchangeRates.put("LAK", 19500.0); // Lao Kip (Laos)
exchangeRates.put("YER", 250.00);  // Yemeni Rial (Yemen)
exchangeRates.put("SLL", 23000.0); // Sierra Leonean Leone (Sierra Leone)
exchangeRates.put("BND", 1.34);    // Brunei Dollar (Brunei)
exchangeRates.put("FJD", 2.22);    // Fijian Dollar (Fiji)
exchangeRates.put("PGK", 3.57);    // Papua New Guinean Kina (Papua New Guinea)
exchangeRates.put("TOP", 2.35);    // Tongan Pa'anga (Tonga)
exchangeRates.put("WST", 2.75);    // Samoan Tala (Samoa)
exchangeRates.put("VUV", 118.75);  // Vanuatu Vatu (Vanuatu)
exchangeRates.put("XCD", 2.70);    // East Caribbean Dollar (Caribbean)
exchangeRates.put("TTD", 6.80);    // Trinidad and Tobago Dollar (Trinidad & Tobago)
exchangeRates.put("JMD", 153.50);  // Jamaican Dollar (Jamaica)
exchangeRates.put("BSD", 1.00);    // Bahamian Dollar (Bahamas)
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
