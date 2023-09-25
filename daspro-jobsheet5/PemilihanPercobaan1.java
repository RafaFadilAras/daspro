
import java.util.Scanner; 
public class PemilihanPercobaan1 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);
        System.out.print("Masukkan Angka: ");
        int angka = input24.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " +angka+ "Bilangan genap");
        }
        else {
            System.out.println("Angka " +angka+ "Bilangan ganjil");
        }
        
        }
}
