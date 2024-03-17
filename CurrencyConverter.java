import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0); 
        exchangeRates.put("EUR", 0.84); 
        exchangeRates.put("GBP", 0.74); 
        
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);

       
        return amount * (toRate / fromRate);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");

       
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

       
        System.out.print("Enter source currency (e.g., USD, EUR, GBP): ");
        String fromCurrency = scanner.next().toUpperCase();

       
        System.out.print("Enter target currency (e.g., USD, EUR, GBP): ");
        String toCurrency = scanner.next().toUpperCase();

      
        double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);

     
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);

        scanner.close();
    }
}