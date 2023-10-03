import java.util.Scanner;

public class Pemilihan2Percobaan2 {

    public static void main (String [] args) {
        Scanner input24 = new Scanner (System.in);

        System.out.println("Masukkan sudut1 : ");
        int sudut1 = input24.nextInt();
        System.out.println("Masukkan sudut2 : ");
        int sudut2 = input24.nextInt();
        System.out.println("Masukkan sudut3 : ");
        int sudut3 = input24.nextInt();

        double totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) 
            if (sudut1==90 || sudut2==90 || sudut3==90)
                if ((sudut1 == sudut2 ) || (sudut2 == sudut3 ) || (sudut1 == sudut3))
                    System.out.println("Segitiga tersebut adalah segitiga siku-siku sama kaki");
                else 
                    System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if (sudut1==60 && sudut2==60 && sudut3==60)
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if (sudut1==sudut2 || sudut2==sudut3 || sudut1==sudut3)
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        else 
            System.out.println("Bukan segitiga");
    }

}