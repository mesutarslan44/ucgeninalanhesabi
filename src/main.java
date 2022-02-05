import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    int a, b, c;
    double u,alan;
    double Alan;


    Scanner girdi = new Scanner(System.in);

    System.out.println("Üçgenin Alanını Hesaplama");
    System.out.println("-------------------------");

    System.out.println("1.Kenarı giriniz: ");
    a= girdi.nextInt();
    System.out.println("İkinci kenarı giriniz: ");
    b= girdi.nextInt();
    System.out.println("Üçüncü kenarı giriniz: ");
    c= girdi.nextInt();

    u= (a+b+c)/2.0;
    alan= Math.sqrt(u* (u-a)* (u-b) * (u-c));
        System.out.println("Üçgenin Alanı: " +alan);




    }
}
