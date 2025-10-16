import java.util.Scanner;
public class Fika_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===== Menu Kami =====");
        System.out.println("1. Ayam Geprek Bakar");
        System.out.println("2. Bakso");
        System.out.println("3. Nasi Bakar");
        System.out.println("4. Nutrisari");
        System.out.println("5. Es teh");
        System.out.println("Pilihan Menu (1-5)");
        int pilihan= in.nextInt();
        
        if (pilihan ==1){
            System.out.println("Anda Memilih Ayam Geprek Bakar");
        }else if (pilihan ==2){
            System.out.println("Anda Memilih Bakso");
        }else if (pilihan ==3){
            System.out.println("Anda Memilih Nasi Bakar");
        }else if (pilihan ==4){
            System.out.println("Anda memilih Nutrisari");
        }else if (pilihan ==5){
            System.out.println("Anda memilih Es teh");
        }else {
            System.out.println("Maaf Pilihan Menu Tidak Tersedia");
        }
    }
}
