import java.util.Scanner;
public class fika123 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
        System.out.println("Masukkan panjang: ");
        double Panjang = in.nextDouble();
        System.out.println("Masukkan lebar  : ");
        double Lebar = in.nextDouble();
    //Menghitung luas persegi panjang 
        double Luas = Panjang*Lebar ;   //Rumus menghitung persegi panjang 
        System.out.println("Jadi luas persegi panjang adalah " +Luas);
             
    }
  
     
}
