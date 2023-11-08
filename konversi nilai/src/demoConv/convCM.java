package demoConv;

import java.util.Scanner;
public class convCM {
    int M,CM,pilih;
    Scanner Pilih = new Scanner(System.in);

    public void convMtoCM(){
        System.out.println("Konversi Meter ke Centimeter");
        System.out.println("Masukkan Nilai Meter :");
        M = Pilih.nextInt();

        CM = M * 100;
        System.out.println("Nilai Centimeter :" + CM);
    }

}