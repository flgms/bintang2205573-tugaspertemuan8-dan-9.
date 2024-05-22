package Pertemuan8.pert8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (// membuat scanner untuk input
        Scanner input = new Scanner(System.in)) {
            // meminta pengguna memasukan sisi segitiga
            System.out.print("Masukkan sisi 1: ");
            double sisi1 = input.nextDouble();
            System.out.print("Masukkan sisi 2: ");
            double sisi2 = input.nextDouble();
            System.out.print("Masukkan sisi 3: ");
            double sisi3 = input.nextDouble();

            // meminta pengguna memasukan warna dan apakah segitiga terisi 
            System.out.print("Masukkan warna: ");
            String warna = input.next();
            System.out.print("Apakah segitiga terisi? ");
            boolean terisi = false;

            try {
                    terisi = input.nextBoolean();
            } catch (InputMismatchException e) {
                        input.nextLine(); // Bersihkan buffer
                        System.out.println("Input tidak valid. Masukkan 'true' atau 'false'.");
                        }

            // membuat objek Segitiga
            Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
            segitiga.setWarna(warna);
            segitiga.setTerisi(terisi);

            // menampilkan hasil
            System.out.println("Luas: " + segitiga.getArea());
            System.out.println("Keliling: " + segitiga.getPerimeter());
            System.out.println("Warna: " + segitiga.getWarna());
            System.out.println("Terisi: " + segitiga.getTerisi());
        }


}
}