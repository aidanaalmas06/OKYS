import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("Küçük Prens", "Antoine de Saint-Exupéry");
        KitapKopyasi kopya1 = new KitapKopyasi("K-001", kitap);
        KitapKopyasi kopya2 = new KitapKopyasi("K-002", kitap);
        kitap.kopyaEkle(kopya1);
        kitap.kopyaEkle(kopya2);

        Kullanici kullanici = new Kullanici("U-001", "Ayşe Yılmaz");
        OduncKaydi kayit = new OduncKaydi(kullanici, kopya1, LocalDate.now());

        System.out.println("Kitap: " + kitap);
        System.out.println("Kitap kopyası sayısı: " + kitap.getKopyalar().size());
        System.out.println("Ödünç kaydı: " + kayit);
        System.out.println("Kopya ödünçte mi? " + kopya1.isOduncte());
        kayit.iadeEt(LocalDate.now());
        System.out.println("İade sonrası kopya ödünçte mi? " + kopya1.isOduncte());
    }
}
