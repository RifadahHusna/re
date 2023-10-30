import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasilPenjumlahan = angka1 + angka2;
            double hasilPengurangan = angka1 - angka2;
            double hasilPerkalian = angka1 * angka2;
            double hasilPembagian = angka1 / angka2;

            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
            System.out.println("Hasil pengurangan: " + hasilPengurangan);
            System.out.println("Hasil perkalian: " + hasilPerkalian);
            System.out.println("Hasil pembagian: " + hasilPembagian);

            input.close();
        }
    }
