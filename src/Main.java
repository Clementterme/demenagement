import java.util.Scanner;

public class Main {
    static void main() {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Saisir le nombre de cartons à transporter : ");
        int cartons = clavier.nextInt();
        Scanner clavier2 = new Scanner(System.in);
        System.out.print("Saisir la capacité du camion : ");
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
