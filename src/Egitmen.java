import java.util.HashMap;
import java.util.Scanner;
public class Egitmen extends Insan
{
      private String egitmenId;
      private HashMap<String ,String> verilenDersler;
      public Egitmen()
      {
          verilenDersler = new HashMap<>();
      }
      public void dersAtamasiYap() throws Exception
      {
          Scanner s = new Scanner(System.in);
          System.out.println("Egitmene atama yapmak istediginiz dersin kodunu girin: ");
          String dersKodu = s.next();
          s.nextLine();
          if(verilenDersler.containsKey(dersKodu))
          {
              throw new Exception("Bu ders zaten eğitmende kayitli");
          }

          System.out.println("Dersin ismini girin: ");
          String dersIsmi = s.nextLine();
          verilenDersler.put(dersKodu,dersIsmi);
      }
      public void egitmeninDersleriniGor()
      {
          for(String s: verilenDersler.keySet())
          {
              System.out.printf("Dersin kodu: %s, Dersin adi: %s\n",s,verilenDersler.get(s));
          }
      }

      //Encapsulation
    public void setEgitmenId(String egitmenId)
    {
        this.egitmenId = egitmenId;
    }
    public String getEgitmenId()
    {
        return this.egitmenId;
    }

}
