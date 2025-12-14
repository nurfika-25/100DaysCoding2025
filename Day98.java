import java.util.Scanner;

public class Day93 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas Deret : ");
        int batas = in.nextInt();
        int saaa = 0;
        int fi = 1;
        System.out.print("Deret Fibonacci : ");
        for (int i = 0; i <= batas; i++) {
            System.out.print(saaa + " ");
            saaa = saaa + fi;
            fi = saaa - fi;
        }
    }
}
