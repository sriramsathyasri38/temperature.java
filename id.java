import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Tool");
        System.out.println("---------------------------");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            case 2:
                System.out.print("Enter temperature in Celsius: ");
                double celsius2 = scanner.nextDouble();
                double fahrenheit2 = (celsius2 * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit2);
                break;
            default:
                System.out.println("Invalid choice. Please enter either 1 or 2.");
                break;
        }

        scanner.close();
    }
}
