import java.util.Scanner;

public class Main {
    static void main() {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir le nombre de cartons à transporter : ");

        while (!clavier.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre.");
            clavier.nextLine();
        }

        int cartons = clavier.nextInt();

        Scanner clavier2 = new Scanner(System.in);

        System.out.print("Saisir la capacité du camion : ");

        while (!clavier2.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre.");
            clavier2.nextLine();
        }

        int capaciteCamion = clavier2.nextInt();

        while (cartons != 0) {
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

// Entrées doivent être nombres et différents de 0