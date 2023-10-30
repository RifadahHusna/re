import java.util.Scanner;

/**
 * Kelas PercepatanNewtonCalculator digunakan untuk menghitung percepatan (F = ma) berdasarkan gaya dan massa yang diberikan.
 */
public class PercepatanNewtonCalculator {

    /**
     * Metode ini menghitung percepatan Newton berdasarkan gaya dan massa yang diberikan.
     *
     * @param gaya  Gaya dalam Newton
     * @param massa Massa dalam kilogram
     * @return Percepatan Newton dalam m/s^2
     * @throws IllegalArgumentException jika massa kurang dari atau sama dengan 0
     */
    public static double hitungPercepatanNewton(double gaya, double massa) {
        if (massa <= 0) {
            throw new IllegalArgumentException("Massa harus lebih dari 0");
        }
        return gaya / massa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaya (dalam Newton): ");
        double gaya = scanner.nextDouble();

        System.out.print("Masukkan massa (dalam kilogram): ");
        double massa = scanner.nextDouble();

        scanner.close();

        double percepatan = hitungPercepatanNewton(gaya, massa);
        System.out.println("Percepatan Newton: " + percepatan + " m/s^2");
    }
}

