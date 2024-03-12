package pl.pp;
import java.util.Scanner;

public class KonwersjaDni {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.print("Podaj liczbę dni (wartość niedodatnia kończy program): ");
            int liczbaDni = scanner.nextInt();


            if (liczbaDni <= 0) {
                System.out.println("Wprowadzono wartość niedodatnią. Koniec programu.");
                break;
            }


            int tygodnie = liczbaDni / 7;
            int resztaDni = liczbaDni % 7;


            System.out.println(liczbaDni + " dni to " + tygodnie + " tygodnie i " + resztaDni + " dni.");
        }
    }
}