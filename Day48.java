import java.util.Scanner;
public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = in.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = in.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak bisa!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                break;
  }

       
    }
}
