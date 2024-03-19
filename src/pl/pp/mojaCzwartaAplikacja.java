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
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            System.out.print("Podaj numer operacji: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nieprawidłowy wybór. Wprowadź numer od 1 do 5.");
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Nieprawidłowy wybór. Wprowadź numer od 1 do 5.");
                continue;
            }

            if (choice == 5) {
                System.out.println("Dziękujemy. Do widzenia!");
                break;
            }

            double num1, num2;
            System.out.print("Podaj pierwszą liczbę: ");
            num1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Podaj drugą liczbę: ");
            num2 = Double.parseDouble(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Wynik dodawania: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Wynik odejmowania: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Wynik mnożenia: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Nie można dzielić przez zero!");
                    } else {
                        System.out.println("Wynik dzielenia: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór.");
                    break;
            }
        }
        scanner.close();
    }
}

