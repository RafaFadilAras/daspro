import java.util.Scanner;
public class PemilihanPercobaan2 {
     public static void main(String[] args) {
     Scanner input24 = new Scanner(System.in);

     System.out.print("Nilai UAS:");
     float UAS = input24.nextFloat();
     System.out.print("Nilai UTS:");
     float UTS = input24.nextFloat();
     System.out.print("Nilai Kuis:");
     float Kuis = input24.nextFloat();
     System.out.print("Nilai Tugas:");
     float Tugas = input24.nextFloat();

     float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);

     String message = total < 65 ? "Remidi" : "Tidak Remidi";
     System.out.println("Nilai akhir = " +total+ " sehingga " +message);

     String predikat="Dikeluarkan";

     if (total > 80 && total <= 100) {
          predikat = "A";
     } else if (total > 73 && total <= 80) {
          predikat = "B+";
     } else if (total > 65 && total <= 73) {
          predikat = "B";
     } else if (total > 60 && total <= 65) {
          predikat = "C+";
     } else if (total > 50 && total <= 60) {
          predikat = "C";
     } else if (total > 39 && total <= 50) {
          predikat = "D";
     } else if (total > 39) {
          predikat = "E";
     }

     System.out.println("Predikat nilai anda:" +predikat);

     }
     
}   
