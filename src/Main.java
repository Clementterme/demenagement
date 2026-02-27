import java.util.Scanner;

public class Main {
    static void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Saisir le nombre de cartons à transporter : ");
//        Vérification du type de l'entrée
        while (!keyboard.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre.");
            keyboard.nextLine();
        }

        int cartons = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("Saisir la capacité du camion : ");
//        Vérification du type de l'entrée
        while (!keyboard.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre.");
            keyboard.nextLine();
        }
        
        int truckCapacity = keyboard.nextInt();
//        Affichage des messages des voyages
        while (cartons > 0) {
            if (cartons >= truckCapacity) {
                System.out.println("Un voyage de " + truckCapacity + " cartons.");
                cartons = cartons - truckCapacity;
            } else {
                System.out.println("Un voyage de " + cartons + " cartons.");
                cartons = 0;
            }
        }
    }
}