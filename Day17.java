import java.util.Scanner;
public class Day17Fika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a= input.nextInt();
        System.out.print("Masukkan angka kedua  : ");
        int b = input.nextInt();
        int hasil = a % b;
        System.out.println();
        System.out.println("Hasil sisa bagi dari a dan b " + ("adalah ")+ (a % b)); 

    }
  
}
