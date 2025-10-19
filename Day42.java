import java.util.Scanner;
public class Fika_20 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String a = in.nextLine();
        System.out.print("Masukkan Gaji pokok: Rp. ");
        double b = in.nextDouble();
        System.out.print("Masukkan jumlah hari lembur: ");
        int c = in.nextInt();
        double lembur = 100000.0;
        double total = b+(c*lembur);
        double pajak = 0.12;
        double tpjk =total*pajak;
        
        if (total>=5000000.0) {
            System.out.println("Anda dikenakan pajak 12%");
            System.out.println("Gaji bersih: "+ (total-tpjk));  
        }
        else{
            System.out.println("Gaji bersih: "+ total); 
        }
    }
}
