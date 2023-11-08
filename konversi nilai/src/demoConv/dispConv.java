package demoConv;

import java.util.Scanner;
public class dispConv {
    int M,CM,MM,pilih;
    Scanner Pilih = new Scanner(System.in);
    char opr = 'y';

    public void convCM(){
        System.out.println("Konversi Meter ke Centimeter");
        System.out.println("Masukkan Nilai Meter :");
        M = Pilih.nextInt();

        CM = M * 100;
        System.out.println("Nilai Centimeter :" + CM);
    }
    public void convMM(){
        System.out.println("Konversi Meter ke Milimeter");
        System.out.println("Masukkan Nilai Meter :");
        M = Pilih.nextInt();

        MM = M * 1000;
        System.out.println("Nilai Milimeter :" + MM);
    }

    public void Display(){
        do{
            System.out.println("1. Konversi Meter ke Centimeter");
            System.out.println("2. Konversi Meter ke Milimeter");
            System.out.println("Pilih");
            pilih = Pilih.nextInt();

            if (pilih == 1){
                convCM();
            }else if (pilih == 2){
                convMM();
            }else{
                System.out.println("Maaf inputan salah");
            }while (pilih == 0 );

            System.out.println("apakah mau lanjut?");


        } while (opr == 'y' || opr == 'Y');
    }

}