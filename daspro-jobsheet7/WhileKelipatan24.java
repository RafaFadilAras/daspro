import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class WhileKelipatan24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah=0, counter=0;
        System.out.println("Masukkan bilangan kelipatan(1-9) : ");
        kelipatan = scan.nextInt();
        double average;
        int i = 1;
        while (i<= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        
        average = jumlah/counter;
        
        System.out.printf("Banyaknya bilangan %d dari 1-50 adalah %d\n", kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1-50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1-50 adalah %.2f", kelipatan, average);
        
    }
}

