import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Ders> mufredatDersleri = new ArrayList<>();
        boolean donguDevamEdiyor = true;
        while(donguDevamEdiyor)
        {
            System.out.println("Yeni Ders Eklemek Icin (1), Tüm Dersleri eklediyseniz (2) Tiklayiniz.");
            byte controller = s.nextByte();

            switch (controller)
            {
                case 1:
                    String dersKodu;
                    String dersIsmi;
                    int krediMiktari;
                    System.out.println("Ders Kodunu Giriniz: ");
                    dersKodu = s.next();
                    s.nextLine();
                    System.out.println("Ders Ismini giriniz: ");
                    dersIsmi = s.nextLine();
                    System.out.println("Dersin Kredi Miktarini Giriniz: ");
                    krediMiktari = s.nextInt();
                    Ders d = new Ders(dersKodu,dersIsmi,krediMiktari);
                    mufredatDersleri.add(d);
                    break;
                case 2:
                    donguDevamEdiyor = false;
                    System.out.println("Basariyla Mufredat'a Ders Ekleme Sisteminden Cikildi");
                    break;
                default:
                    System.out.println("Gecerli bir giris  yapmadiniz.");
            }
        }





    }
}
