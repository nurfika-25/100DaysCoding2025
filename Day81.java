import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] nama = {"fika", "aksa", "kia", "amel", "rumi"};
        System.out.print("Masukkan indeks nama (0-4): ");
        int i = in.nextInt();

        if (i >= 0 && i < nama.length) {
            System.out.println("Nama pada indeks " + i + " adalah: " + nama[i]);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
