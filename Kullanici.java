import java.util.Objects;

public class Kullanici {
    private final String kullaniciNo;
    private final String ad;

    public Kullanici(String kullaniciNo, String ad) {
        this.kullaniciNo = Objects.requireNonNull(kullaniciNo, "Kullanıcı numarası boş olamaz.");
        this.ad = Objects.requireNonNull(ad, "Ad boş olamaz.");
    }
    public String getKullaniciNo() { return kullaniciNo; }
    public String getAd() { return ad; }
    @Override public String toString() { return ad + " (" + kullaniciNo + ")"; }
}
