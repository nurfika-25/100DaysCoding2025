import java.util.Scanner;
public class SoalSoalASdos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n==PILIHAN MENU MINUMAN==");
            System.out.println("1. JUS ALPUKAT\n2. MEAL SHAKE OREO\n3. MATCHA LATTE\n4. HOT COKELAT\n5. Tidak jadi pesan");
            System.out.print("Masukkan pilihan: ");
            int pilihan = in.nextInt();
            switch(pilihan){
                case 1 ->{
                    System.out.println("\nAnda memilih JUMS ALPUKAT");
                }
                case 2 ->{
                    System.out.println("\nAnda memilih MEAL SHAKE OREO");
                }
                case 3->{
                    System.out.println("\nAnda memilih MARCHA LATTE");
                }
                case 4 ->{
                    System.out.println("\nAnda memilih HOT COKELAT");
                }
                case 5 ->{
                    System.out.println("\nAnda tidak jadi memesan\nPALAIMO LAO JINGAN");
                    return;
                }
                default -> {
                    System.out.println("\nPilihan anda tidak ada dalam menu!");
                    System.out.println("Tolong pilih ulang!!");
                }
            }
        } while (true);
    }
}
