package pl.pp;

import java.util.Scanner;



public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        // Inicjalizacja obiektu Scanner do wczytywania danych
        Scanner scanner = new Scanner(System.in);

        // Pytanie o wiek
        System.out.print("Podaj swój wiek w latach: ");
        int wiekLata = scanner.nextInt();

        // Przeliczenie na sekundy (1 rok = 365 dni)
        double wiekSekundy = wiekLata * 365 * 24 * 60 * 60;

        // Wyświetlenie wyniku
        System.out.println("Twój wiek przeliczony na sekundy to: " + wiekSekundy + " sekundy.");

        // Zamknięcie obiektu Scanner
        scanner.close();
    }
}
