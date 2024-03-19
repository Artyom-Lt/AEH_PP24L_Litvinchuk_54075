/*package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter lower and upper integer limits: ");
            int dolnaGranica = scanner.nextInt();
            int gornaGranica = scanner.nextInt();

            if(gornaGranica<=dolnaGranica){
                System.out.println("Done");
                break;
            }

            int sumaKwadratow = 0;

            for(int i = dolnaGranica; i<=gornaGranica; i++){
                sumaKwadratow += i*i;
            }

            System.out.println("The sum of the squares from " + (dolnaGranica * dolnaGranica) + " to " + (gornaGranica * gornaGranica) + " is " + sumaKwadratow);

        }
    }
}
 */
package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.print("Wybierz opcję (1-5): ");

            int wybor = 0;
            while (true) {
                try {
                    wybor = Integer.parseInt(scanner.nextLine());
                    if (wybor >= 1 && wybor <= 5) {
                        break;
                    } else {
                        System.out.println("Nieprawidłowy wybór. Wybierz liczbę od 1 do 5.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nieprawidłowy wybór. Wybierz liczbę od 1 do 5.");
                }
            }

            if (wybor == 5) {
                System.out.println("Do widzenia!");
                break;
            }

            double liczba1, liczba2;
            System.out.print("Podaj pierwszą liczbę: ");
            liczba1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Podaj drugą liczbę: ");
            liczba2 = Double.parseDouble(scanner.nextLine());

            double wynik = 0;
            switch (wybor) {
                case 1:
                    wynik = liczba1 + liczba2;
                    System.out.println("Wynik dodawania: " + wynik);
                    break;
                case 2:
                    wynik = liczba1 - liczba2;
                    System.out.println("Wynik odejmowania: " + wynik);
                    break;
                case 3:
                    wynik = liczba1 * liczba2;
                    System.out.println("Wynik mnożenia: " + wynik);
                    break;
                case 4:
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                        System.out.println("Wynik dzielenia: " + wynik);
                    } else {
                        System.out.println("Nie można dzielić przez zero.");
                    }
                    break;
            }
        }

        scanner.close();
    }
}
