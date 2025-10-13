import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan Nilai Harian: ");
        int nilai1 = in.nextInt();
        System.out.print("Masukkan Nilai Ujian: ");
        int nilai2 = in.nextInt();
        
        if(nilai1>=70){
            System.out.println("Nilai pertama  Lulus");
            if(nilai2>=75){
                System.out.println("Nilai kedua juga lulus");
            }else{
                System.out.println("Tapi nilai kedua tidak lulus");
            }
        }else{
            System.out.println("Nilai pertama dan kedua tidak lulus");
        }
    }
}
        
