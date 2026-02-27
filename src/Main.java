public class Main {
    static void main() {
        int cartons = 34;
        for (int i = 0; i <= cartons; i++) {
            if (cartons > 9) {
                System.out.println("Un voyage de " + 9 + " cartons.");
                cartons = cartons - 9;
            } else {
                System.out.println("Un voyage de " + cartons + " cartons.");
                cartons = 0;
            }
        }
    }
}
