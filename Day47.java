import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu;

        System.out.println("Masukkan Jadwal Kegiatan Sehari-hari: ");

        System.out.print("Senin  : ");
        Senin = in.nextLine();
        System.out.print("Selasa : ");
        Selasa = in.nextLine();
        System.out.print("Rabu   : ");
        Rabu = in.nextLine();
        System.out.print("Kamis  : ");
        Kamis = in.nextLine();
        System.out.print("Jumat  : ");
        Jumat = in.nextLine();
        System.out.print("Sabtu  : ");
        Sabtu = in.nextLine();
        System.out.print("Minggu : ");
        Minggu = in.nextLine();

        System.out.println("Sekarang hari apa? ");
        String Hari = in.nextLine();

        System.out.println("Jadwal kamu hari " + Hari + " adalah:");

        switch (Hari) {
            case "Senin":
                System.out.println(Senin);
                break;
            case "Selasa":
                System.out.println(Selasa);
                break;
            case "Rabu":
                System.out.println(Rabu);
                break;
            case "Kamis":
                System.out.println(Kamis);
                break;
            case "Jumat":
                System.out.println(Jumat);
                break;
            case "Sabtu":
                System.out.println(Sabtu);
                break;
            case "Minggu":
                System.out.println(Minggu);
                break;
            default:
                System.out.println("Hari yang anda masukkan tidak valid!");
                break;
        }

    }
}
