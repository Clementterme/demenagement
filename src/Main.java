import java.util.Scanner;

public class Main {
    static void main() {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir le nombre de cartons à transporter : ");
//        Vérification du type de l'entrée
        while (!clavier.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre.");
            clavier.nextLine();
        }

        int cartons = clavier.nextInt();

        clavier.nextLine();

        System.out.print("Saisir la capacité du camion : ");
//        Vérification du type de l'entrée
        while (!clavier.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre.");
            clavier.nextLine();
        }

        int capaciteCamion = clavier.nextInt();
//        Affichage des messages des voyages
        while (cartons > 0) {
            if (cartons >= capaciteCamion) {
                System.out.println("Un voyage de " + capaciteCamion + " cartons.");
                cartons = cartons - capaciteCamion;
            } else {
                System.out.println("Un voyage de " + cartons + " cartons.");
                cartons = 0;
            }
        }
    }
}