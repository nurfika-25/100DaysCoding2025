import java.util.Scanner;

public class DDPArray_ {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris= in.nextInt();
        for (int i = 1; i <= baris; i++) {
            System.out.print(i);
        }
    }
}
