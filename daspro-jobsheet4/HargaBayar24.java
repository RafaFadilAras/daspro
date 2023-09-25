import java.util.Scanner;
public class HargaBayar24 {
    public static void main (String []args) {
        Scanner input =new Scanner (System.in);

        int harga, jmlBarang, jmlHalBuku;
        double disc, total, bayar, jmlDisc;
        String merkBuku;

        System.out.println("merkBuku");
        merkBuku=input.nextLine();
        System.out.println("masukkan jumlah halaman buku");
        jmlHalBuku=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli");
        jmlBarang=input.nextInt();
        System.out.println("masukkan diskon barang");
        disc=input.nextDouble();

        total=harga*jmlBarang;
        jmlDisc=total*disc;
        bayar=total-jmlDisc;

        System.out.println("Diskon yang anda dapatkan adalah" +jmlDisc);
        System.out.println("Jumlah yang harus dibayar adalah" +bayar);

    }
}
