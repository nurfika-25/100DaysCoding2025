package Nurfika_D0225006;
import java.util.Scanner;
public class Fika_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka= in.nextInt();
        
        if (angka %3==0 && angka %5==0) {
            System.out.println("Angka kelipatan 3 dan 5");   
        }else if (angka %3==0) {
            System.out.println("Angka kelipatan 3");
        }else if (angka %5==0) {
            System.out.println("Angka kelipatan 5");
        }else {
            System.out.println("bukan kelipatan 3 dan 5");
        }
    }
}
