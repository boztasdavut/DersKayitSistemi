import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Egitmen extends Insan
{
    Scanner s = new Scanner(System.in);
      private String egitmenId;
    public static HashMap<String, HashMap<String,Ders>> egitmeninVerdigiDersler = new HashMap<>();
    HashMap<String,Ders> dersler;

    private HashMap<String,Ders> uzmanlikAlanlari;
      private String alan;
      public Egitmen(String egitmenId,String isim,String soyisim,String alan)
      {
          egitmeninVerdigiDersler = new HashMap<>();
          uzmanlikAlanlari = new HashMap<>();
          dersler = new HashMap<>();
          setEgitmenId(egitmenId);
          setAlan(alan);
          setIsim(isim);
          setSoyisim(soyisim);
      }
      public void setUzmanlikAlanlari(Ders d)
      {

          if(uzmanlikAlanlari.containsKey(d.getDersKodu()))
          {
              System.out.println("Bu uzmanlik alani egitmende zaten kayitli.");
          }else{
              System.out.println("Ders başarili olarak uzmanlik alanina eklendi.");
              uzmanlikAlanlari.put(d.getDersKodu(),d);
          }

      }
      public void setVerilenDersler()
      {
          System.out.println("Egitmene aşağıdaki derslerden birisini atama olarak yapabilirsiniz.");
          for(String s: uzmanlikAlanlari.keySet())
          {
              System.out.println("Ders kodu: "+s+" Ders Adi: "+uzmanlikAlanlari.get(s).getDersIsmi());
          }
          System.out.println("Kaydetmek istediginiz Ders kodunu giriniz: ");
          String dersKodu = s.next();
          Ders d = new Ders(dersKodu,uzmanlikAlanlari.get(dersKodu).getDersIsmi(),uzmanlikAlanlari.get(dersKodu).getKrediMiktari());
          if(uzmanlikAlanlari.containsKey(d.getDersKodu()))
          {
              dersler.put(d.getDersKodu(),d);
              egitmeninVerdigiDersler.put(getEgitmenId(),dersler);
              System.out.println("Ders Egitmene Basariyla Kaydedildi.");
          }else
          {
              System.out.println("Bu ders hocanin uzmanlik alanlari arasinda yer almamaktadir.");
          }



      }
      public void egitmeninDersleriniGor()
      {
          String s = getEgitmenId();
          for(String s2: egitmeninVerdigiDersler.get(s).keySet())
          {
              System.out.printf("Ders Kodu: %s, Ders Adi: %s\n",s2,egitmeninVerdigiDersler.get(s).get(s2).getDersIsmi());
          }

      }
      public void egitmeninUzmanliklariniGor()
      {
          for(String dersKodu: uzmanlikAlanlari.keySet())
          {
              System.out.printf("Ders kodu: %s, Ders Adi: %s\n",dersKodu,uzmanlikAlanlari.get(dersKodu));
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

    public void setAlan(String alan)
    {
        this.alan = alan;
    }
    public String getAlan()
    {
        return this.alan;
    }
    public void setIsim(String isim)
    {
        this.isim = isim;
    }
    public String getIsim()
    {
        return this.isim;
    }
    public void setSoyisim(String soyisim)
    {
        this.soyisim = soyisim;
    }
    public String getSoyisim()
    {
        return this.soyisim;
    }

}
