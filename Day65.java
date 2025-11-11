import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in); 
        System.out.print("Masukkan bilangan: ");
          int n = in.nextInt();  
          int faktorial = 1;
            for (int i = 1; i <= n; i++) {
             faktorial = faktorial * i;
           }
              System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
      
    }
}
