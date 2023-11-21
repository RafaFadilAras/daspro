import java.util.Scanner;
public class TerimaKasih_24 {
    public static void ucapanTerimaKasih() {
        System.out.println("Thank You for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void ucapanTambahan (String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        ucapanTerimaKasih();
        String ucapan = "Terimakasih Pak.. Bu.. semoga sehat selalu";
        ucapanTambahan(ucapan);
    }
}