package daspro;

import java.util.Scanner;

public class CobaLogin {
     private static final String pin="123456";
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Username : ");
        String masukkanUsn = input.nextLine();
        System.out.print("Masukkan PIN : ");
        String masukkanPin = input.nextLine();

        if (masukkanPin.equals(pin)) {
            System.out.println("PIN Benar, Akses diberikan");
        } else {
            System.out.println("PIN Salah");
            System.exit(0);
        }
     }
}
