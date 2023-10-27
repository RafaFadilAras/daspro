import java.util.Scanner;
public class ArrayNilai24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int [] nilaiAkhir = new int[10];
    
    for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai akhir ke-" + i + " : ");
    nilaiAkhir[i] = sc.nextInt();
    }
    
    String status;
    for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70) {
            status = " Lulus!" ;
        } else  
            status = " Tidak Lulus!" ;
            System.out.println("Mahasiswa ke- " +i+ "" +status);
        }
    }
}

