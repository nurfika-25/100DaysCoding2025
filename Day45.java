import java.util.Scanner;
public class fikaayo {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nomor Undian(111,125,123): ");
        int pilihan = in.nextInt();
        
        switch(pilihan){
            case 111 :
                System.out.println("===Selamat Anda Mendapatkan Mobil===");
                break;
            case 125 : 
                System.out.println("===Selamat Anda Mendapatkan Sepeda===");
                break;
            case 123 :
                System.out.println("Selamat Anda Mendapatkan Tiket voucher 10%");
                break;
            default : 
                System.out.println("===Anda belum Beruntung===");
                break;
             
        }
    }
}
        
        
