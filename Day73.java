import java.util.Scanner;
public class SoalSoalASdos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int angka;
        
        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            angka = in.nextInt();

            if (angka < 0) {
                break;
            }
            total += angka; 
        }
        System.out.println("Total penjumlahan angka = " + total);
    }
}
