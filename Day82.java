import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Array: ");
        int a = in.nextInt();
        int[] angka = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            angka[i] = in.nextInt();
        }
        
//   Menampilkan semua isi Array
        for (int i = 0; i < a; i++) {
            System.out.println("Elemen ke-" + i + " adalah " + angka[i]);
        }
    }
}
