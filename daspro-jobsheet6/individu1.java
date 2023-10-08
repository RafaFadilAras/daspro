import java.util.Scanner;
public class individu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bil1, bil2, bil3, maks=0;

        System.out.println("Masukkan Bilangan ke-1 : ");
        bil1 = input.nextInt();
        System.out.println("Masukkan Bilangan ke-2 : ");
        bil2 = input.nextInt();
        System.out.println("Masukkan Bilangan ke-3 : ");
        bil3 = input.nextInt();

        if (bil1>bil2) {
            maks=bil1;
            } else {
                maks=bil2;
            } 

            if (bil3>maks) {
                maks=bil3;
        }
            System.out.println("Bilangan terbesar adalah " +maks);
    } 
}
    

