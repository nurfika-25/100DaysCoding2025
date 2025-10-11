import java.util.Scanner;
public class fikaayo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Nilai UTS: ");
        int a= in.nextInt();
        System.out.print("Nilai UAS: ");
        int b= in.nextInt();
        if (a >= 85 && b>= 80){
            System.out.println("Selamat, anda lulus");
        }else if (a >=70 || b >=65){
            System.out.println("Maaf, anda belum lulus");
        }else {
            System.out.println("Persiapkan diri anda kembali di tahun depan");
        }
    }
}
