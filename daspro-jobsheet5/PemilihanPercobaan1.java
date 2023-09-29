
import java.util.Scanner; 
public class PemilihanPercobaan1 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);
        System.out.print("Masukkan Angka: ");
        int angka = input24.nextInt();

        String result = (angka % 2 == 0 ) ? "Angka " +angka+ " Bilangan genap" : "Angka " +angka+ " Bilangan ganjil";
        System.out.println(result);
        }
}

