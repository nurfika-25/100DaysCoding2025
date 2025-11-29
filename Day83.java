import java.util.Scanner;

public class MetodAsdos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Batas: ");
        int n = sc.nextInt();
        System.out.println("Masukkan Nilai Array: ");
        int angka[] = new int[n];
        int tot = 0;
        for (int i = 0; i < angka.length; i++) {
            angka[i] = sc.nextInt();
            tot += angka[i];

        }
        System.out.println("Total dari penjumlahan Array adalah " + tot);
    }
}
