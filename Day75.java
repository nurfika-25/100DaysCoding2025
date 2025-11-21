import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = in.nextLine();
        int panjang = kalimat.length();
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();
       
        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang Kalimat: " + panjang);
        System.out.println("Huruf Besar    : " + hurufBesar);
        System.out.println("Huruf Kecil    : " + hurufKecil);
    }
}
