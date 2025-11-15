import java.util.Scanner;
public class EvMen {
    public static void main(String[] args) {
//       SOAL 1
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka N: "); 
        int n = in.nextInt();
        int tot = 0;
        int faktor = 1;
        
        System.out.print("deret 1 ke-"+n+" : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
         tot+= i;   
        }
        System.out.println();
        System.out.print("deret "+n+" ke-1: ");
       do{
         faktor*=n;
           System.out.print(n);
           n--;
       }while (n>=1);
        System.out.println("\njumlah : "+tot);
        System.out.println("jumlah : "+faktor);
     
}
}


//      SOAL 2
//        Scanner in = new Scanner (System.in);
//        System.out.print("Masukkan Nilai N: ");
//        int N = in.nextInt();
//        int fi = 1;
//        int totgan =0; int jng =0;
//        int totgen =0; int jng2 =0;
//        while (N>=fi){
//            if (fi%2==0) {
//              totgan++;  
//              jng+=fi;
//            }else if (fi%2 !=0) {
//               totgen++;
//               jng2+=fi;
//            }
//            fi++;
//        }
//           System.out.println("total angka ganjil : "+totgen);
//           System.out.println("jumlah nilai ganjil : "+jng2);
//           System.out.println("total angka genap : "+totgan);
//           System.out.println("jumlah nilai ganjil : "+jng);
//   
//        
//    }
//}


//      SOAL 3
//        Scanner in = new Scanner (System.in);
//        System.out.print("Masukkan nilai N: ");
//        int N = in.nextInt();
//        long fak= 1;
//        
//        for (int i = 1; i <= N; i++) {
//            fak*= i;
//        }
//        long t = fak;
//        int JD= 0;
//            if (t == 0) {
//           JD = 1; 
//         } else {
//            while (t > 0) {
//                JD++;
//                t /= 10; 
//            }
//        }
//        System.out.println( + N + "!: " + fak);
//        System.out.println("Jumlah digit: " +JD);
//    }
//}


//     SOAL 4
//        Scanner in = new Scanner (System.in);
//        System.out.print("Masukkan ukuran Persegi: ");
//        int N = in.nextInt();
//        for (int i = 0; i < N; i++) {
//        for (int j = 0; j < N; j++) {
//           System.out.print(" * ");
//            }
//              System.out.println();
//        }
//    }
//}


//      SOAL 5
//        Scanner in = new Scanner (System.in);
//        System.out.print("Masukkan ukuran Persegi: ");
//        int N = in.nextInt();
//        for (int i = 1; i <= N; i++) {
//        for (int j = 1; j <=N; j++) {
//            if(i==1||i==N||j==1||j==N){
//                System.out.print("* "); 
//            }else{
//                System.out.print("  ");
//            }
//        }
//            System.out.println();
//        }
//    }
//}
