import java.util.Scanner;

public class MetodAsdos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] angka = {12, 7, 25, 3, 8, 2};
        System.out.print("Masukkan Angka Yang Ingin Dicari: ");
        int AngkaC = in.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == AngkaC) {
                System.out.println("Angka Yang Dicari Ditemukan Pada Indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Angka Tidak Ditemukan Dalam array");
        }
    }
}
