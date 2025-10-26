import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
            System.out.print("Masukkan umur Anda: ");
            int umur = in.nextInt();
            String hasil = (umur >= 18) ? "Sudah Dewasa" : "Belum Dewasa";
            System.out.println("Anda Dikatakan: " + hasil);
    }
}
