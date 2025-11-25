import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Buat Username: ");
        String username = in.nextLine();
        System.out.print("Buat Password: ");
        String password = in.nextLine(); no
        System.out.println("\nAkun berhasil dibuat!\n");

        String fi, saa;

        while (true) {
            System.out.print("Masukkan Username:  ");
            fi = in.nextLine();

            System.out.print("Masukkan Password:  ");
            saa = in.nextLine();

            if (fi.equals(username) && saa.equals(password)) {
                System.out.println("Login berhasil!!");
                break;  

            } else {
                System.out.println("Login gagal!! Silahkan coba lagi.\n");
            }
        }
    }
}
