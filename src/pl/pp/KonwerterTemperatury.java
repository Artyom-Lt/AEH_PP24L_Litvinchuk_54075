package pl.pp;
import java.util.Scanner;

public class KonwerterTemperatury {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj temperaturę w stopniach Fahrenheit'a (-1 aby zakończyć): ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit == -1) {
                System.out.println("Koniec programu.");
                break;
            }

            double celsius = (fahrenheit - 32) * 5 / 9;
            double kelvin = celsius + 273.15;

            System.out.printf("Temperatura w Celsjuszach: %.2f°C\n", celsius);
            System.out.printf("Temperatura w Kelvinach: %.2fK\n", kelvin);
            System.out.printf("Temperatura w Fahrenheitach: %.2f°F\n", fahrenheit);
        }

        scanner.close();
    }
}