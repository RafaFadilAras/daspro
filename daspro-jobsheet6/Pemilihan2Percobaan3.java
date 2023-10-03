import java.util.Scanner;

public class Pemilihan2Percobaan3 {
    public static void main (String [] args) {
        Scanner input24 = new Scanner (System.in);
        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;
        System.out.print("Masukkan kategori : ");
        kategori = input24.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan = input24.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
            gajibersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.print("Penghasilan Bersih : " +gajibersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajibersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.print("Penghasilan Bersih : " +gajibersih);
        } else
            System.out.println("Masukkan Kategori salah : ");
         
    }
}