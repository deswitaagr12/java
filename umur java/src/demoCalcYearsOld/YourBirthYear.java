package demoCalcYearsOld;
import java.time.DateTimeException;
import java.util.Scanner;

public class YourBirthYear {
    private int year,age;
    Scanner Pilih = new Scanner(System.in);
    public void convMtoCM(){
        System.out.println("Masukan Tahun Kelahiran: ");
        year = Pilih.nextInt();

        age = 2023-year;
        System.out.println("Umur Anda :" + age);
    }
}


