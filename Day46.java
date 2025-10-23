import java.util.Scanner;
public class fikaayo {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int pilihan;
        System.out.println("=== MENU PILIHAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bakso");
        System.out.println("3. Capcay");
        System.out.print("Pilih menu (1-3): ");
        pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda Memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda Memilih Bakso");
                break;
            case 3:
                System.out.println("Anda Memilih Capcay");
                break;
            default:
                System.out.println("Pilihan tidak tersedia ");
                break;
        }

    }
}
