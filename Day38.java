import java.util.Scanner;
public class Fika_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int a= in.nextInt();
        if(a>0){
            System.out.println("angka positif");
        }else if(a<0){
            System.out.println("angka negatif");
        }else{
            System.out.println("angka nol");
        }
    }
}
