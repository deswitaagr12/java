package demoConv;

import java.util.Scanner;
public class convMM {
    int M,MM,pilih;
    Scanner Pilih = new Scanner(System.in);
    public void convMtoCM(){
        System.out.println("Konversi Meter ke Milimeter");
        System.out.println("Masukkan Nilai Meter :");
        M = Pilih.nextInt();

        MM = M * 1000;
        System.out.println("Nilai Milimeter :" + MM);
    }
}
