import java.util.Scanner;
public class Fika_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===== Kegiatan Sehari-hari =====");
        System.out.println("Senin.  Bangun tidur, mandi, kuliah, makan, main uno, commit, tidur");
        System.out.println("Selasa. Bangun tidur, mandi, beres rumah, kuliah, makan, ,commit, tidur");
        System.out.println("Rabu.   Bangun tidur, mandi, beres-beres rumah, masak, makan, kuliah, commit, tidur");
        System.out.println("Kamis.  Bangun tidur, mandi, beres-beres rumah, masak, makan, kuliah, kerja kelompok, main uno, commit, tidur");
        System.out.println("Jumat.  Bangun tidur, mandi, kuliah, makan,kerja kelompok, main uno, commit, tidur");
        System.out.println("Sabtu.  Bangun tidur, mandi, makan, commit, malming, tidur");
        System.out.println("Minggu. bangun tidur, mandi, beres-beres rumah, masak, makan, kerja kelompok, commit, tidur");
        
        System.out.print("Pilih Hari Senin-Minggu: ");
        String Hari= in.nextLine();
        
        switch (Hari) {
            case "Senin":
                System.out.println("Kegiatan Anda adalah Bangun tidur, mandi, kuliah, makan, main uno, commit, tidur");
                break;

            case "Selasa":
                System.out.println("Kegiatan Anda adalah Bangun tidur, mandi, beres rumah, kuliah, makan, commit, tidur");
                break;

            case "Rabu":
                System.out.println("Kegiatan Anda adalah Bangun tidur, mandi, beres rumah, masak, makan, kuliah, commit, tidur");
                break;

            case "Kamis":
                System.out.println("Kegiatan Anda adalah Bangun tidur, mandi, beres rumah, masak, makan, kuliah, kerja kelompok, main uno, commit, tidur");
                break;

            case "Jumat":
                System.out.println("Kegiatan Anda adalah Bangun tidur, mandi, kuliah, makan, kerja kelompok, main uno, commit, tidur");
                break;

            case "Sabtu":
                System.out.println("Kegiatan Anda adalah Bangun tidur, mandi, makan, commit, malming, tidur");
                break;

            case "Minggu":
                System.out.println("Kegiatan Anda adalah Bangun tidur, mandi, beres rumah, masak, makan, kerja kelompok, commit, tidur");
                break;

            default:
                System.out.println("Hari yang anda masukkan tidak valid!");
                break;
        }
    }
}
  
