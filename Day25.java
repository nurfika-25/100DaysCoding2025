import java.util.Scanner;
public class fika123 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka increment: ");
        int fi = in.nextInt();
        System.out.println("Masukkan angka decrement: "); 
        int saa= in.nextInt();
        fi++;
        saa --;
        System.out.println("Hasil dari increment: "+fi); //Hasilnya akan menambah 1 value dari nilai variabel fi
        System.out.println("Hasil dari Decrement: "+saa); //Hasilnya akan mengurangi 1 value dari nilai variabel saaa
        System.out.println("");
    }
}
