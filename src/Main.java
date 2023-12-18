import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c,u,cevre,alan,s;

        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci kenar uzunlugunu giriniz: ");
        a = inp.nextDouble();
        System.out.println("İkinci kenar uzunlugunu giriniz: ");
        b = inp.nextDouble();
        System.out.println("Üçüncü kenar uzunlugunu giriniz: ");
        c = inp.nextDouble();

        cevre = (a+b+c);
        s= (cevre/2);
        alan= Math.sqrt(s* (s-a)*(s-b)*(s-c));

        System.out.println("Üçgenin Alanı: " + alan);


        /*
        //Degiskenleri olustur
        int sagKenar, solKenar;
        double hipo;

        // kullanicidan verileri al
        Scanner inp = new Scanner(System.in);
        System.out.println("Sag kenar uzunlugunu giriniz: ");
        sagKenar = inp.nextInt();

        System.out.println("Sol kenar uzunlugunu giriniz: ");
        solKenar = inp.nextInt();

        hipo = Math.sqrt((sagKenar*sagKenar)+(solKenar*solKenar));
        System.out.println("Hipotenüs: " + hipo);
         */
    }
}