import java.util.ArrayList;
import java.util.Arrays;

public class assignment1 {
    public static void main(String[] args) {

        String[] Barang = {"cabe", "bawang", "bayem", "tempe", "beras"};
        int[] harga = {3000, 2000, 3000, 5000, 20000};
        int uangDina = 50000;

        ArrayList<String> barangDibeli = new ArrayList<>();

        int totalBelanja = 0;
        for (int i = 0; i < Barang.length; i++) {
            if (Barang[i].equals("cabai")) {
                continue;
            }

            int hargaBarang = harga[i];
            totalBelanja += hargaBarang;

            barangDibeli.add(Barang[i]);
        }

        barangDibeli.add("ayam");
        barangDibeli.add("minyak");
        totalBelanja += harga[4] + harga[2];

        System.out.println("Daftar catatan Dina: " + Arrays.toString(Barang));

        System.out.println("Barang yang dibeli Dina: " + barangDibeli);

        System.out.println("Total belanja Dina: " + totalBelanja);
        if (totalBelanja < uangDina) {
            System.out.println("Kurang " + (uangDina - totalBelanja));
        } else if (totalBelanja == uangDina) {
            System.out.println("Pas");
        } else {
            System.out.println("Lebih " + (totalBelanja - uangDina));
        }
    }
}
