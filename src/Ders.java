import java.util.HashMap;

public class Ders
{
    private String dersKodu;
    private String dersIsmi;
    private int krediMiktari;
    private HashMap<String, Egitmen> dersiVerenEgitmenler;

     public Ders(String dersId, String dersIsmi,int krediMiktari)
     {
         this.dersKodu = dersId;
         this.dersIsmi = dersIsmi;
         this.krediMiktari = krediMiktari;
         dersiVerenEgitmenler = new HashMap<>();
     }

     // Encapsulation
    public void setDersKodu(String dersKodu)
    {
        this.dersKodu = dersKodu;
    }
    public String getDersKodu()
    {
        return this.dersKodu;
    }
    public void setDersIsmi(String dersIsmi)
    {
        this.dersIsmi = dersIsmi;
    }
    public String getDersIsmi()
    {
        return this.dersIsmi;
    }
    public void setKrediMiktari(int krediMiktari)
    {
        this.krediMiktari = krediMiktari;
    }
    public int getKrediMiktari()
    {
        return this.krediMiktari;
    }

}
