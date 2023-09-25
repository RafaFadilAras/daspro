import java.util.Scanner;
public class RangkaianListrik {
    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        int R1, R2, R3, R4, I;
        double Rparalel, Rtotal, V;

        System.out.println("masukkan R1: ");
        R1 = sc.nextInt();
        System.out.println("masukkan R2: ");
        R2 = sc.nextInt();
        System.out.println("masukkan R3: ");
        R3 = sc.nextInt();
        
        Rparalel = 1.0 / 1((1.0/R1) + (1.0/R2) + (1.0/R3));
        System.out.println("Rparalel = " +Rparalel);

        System.out.println("masukkan R4: ");
        R4 = sc.nextInt();
        
        Rtotal = Rparalel + R4;
        System.out.println("Rtotal = " +Rtotal);

        System.out.println("masukkan I: ");
        I = sc.nextInt();
        
        V = I * Rtotal;
        System.out.println("V =" +V);

    }

}