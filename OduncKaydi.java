import java.time.LocalDate;
import java.util.Objects;

public class OduncKaydi {
    private final Kullanici kullanici;
    private final KitapKopyasi kopya;
    private final LocalDate alisTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kopya, LocalDate alisTarihi) {
        this.kullanici = Objects.requireNonNull(kullanici, "Kullanıcı boş olamaz.");
        this.kopya = Objects.requireNonNull(kopya, "Kopya boş olamaz.");
        this.alisTarihi = Objects.requireNonNull(alisTarihi, "Alış tarihi boş olamaz.");
        kopya.oduncVer();
    }
    public void iadeEt(LocalDate tarih) {
        if (iadeTarihi != null) throw new IllegalStateException("Bu ödünç kaydı zaten kapatılmış.");
        iadeTarihi = Objects.requireNonNull(tarih, "İade tarihi boş olamaz.");
        kopya.iadeAl();
    }
    public Kullanici getKullanici() { return kullanici; }
    public KitapKopyasi getKopya() { return kopya; }
    public LocalDate getAlisTarihi() { return alisTarihi; }
    public LocalDate getIadeTarihi() { return iadeTarihi; }
    public boolean isAcik() { return iadeTarihi == null; }
    @Override public String toString() {
        return kullanici + " → " + kopya + ", alış: " + alisTarihi + (isAcik() ? ", henüz iade edilmedi" : ", iade: " + iadeTarihi);
    }
}
