package soal2;

import java.util.Scanner;
public class fika {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan nama\t:");
        final String nama= in.nextLine();
        System.out.print("Masukkan umur\t:");
        int umur=in.nextInt();
        System.out.print("Masukkan nim\t:");
        in.nextLine();
        String nim=in.nextLine();
        System.out.print("Masukkan tinggi\t:");
        double tinggi=in.nextDouble();
        System.out.print("Masukkan status\t:");
        boolean status=in.nextBoolean();
        System.out.print("Masukkan alamat\t:");
        in.nextLine();
        String alamat=in.nextLine();
        in.nextLine();
        
        System.out.print("==============BIODATA===============\n");  
        System.out.print("\nNama\t:\t"+nama);
        System.out.print("\nUmur\t:\t"+umur);
        System.out.print("\nNim \t:\t"+nim);
        System.out.print("\nTinggi\t:\t"+tinggi);
        System.out.print("\nStatus\t:\t"+status);
        System.out.print("\nAlamat\t:\t"+alamat);
       System.out.print("\n===================================\n");
    }
   
}
