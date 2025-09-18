package BiodataFika;
import java.util.Scanner;

public class fika {
    public static void main(String[] args) {
    Scanner in= new Scanner (System.in);
        String nama,prodi,kelas,alamat;
        int umur,JumlahSaudarah;
        System.out.print("masukkan nama: ");
        nama = in.nextLine();
        System.out.print("masukkan prodi:");
        prodi = in.nextLine();
        System.out.print("masukkan kelas:");
        kelas = in.nextLine();
        System.out.print("masukkan alamat:");
        alamat = in.nextLine();
        System.out.print("masukkan umur:");
        umur = in.nextInt();
        System.out.print("JumlahSaudarah:");
        JumlahSaudarah= in.nextInt();
        
        
        
        System.out.println("perkenalkan nama saya:"+ nama);
        System.out.println("prodi saya:"+ prodi);
        System.out.println("kelas :"+ kelas);
        System.out.println("alamat saya:"+ alamat);
        System.out.println("saya ber umur: "+ umur);
        System.out.println("JumlahSaudarah:"+ JumlahSaudarah);
        
 }
   
}
