import java.util.Objects;

public class KitapKopyasi {
    private final String kopyaNo;
    private final Kitap kitap;
    private boolean oduncte;

    public KitapKopyasi(String kopyaNo, Kitap kitap) {
        this.kopyaNo = Objects.requireNonNull(kopyaNo, "Kopya numarası boş olamaz.");
        this.kitap = Objects.requireNonNull(kitap, "Kitap boş olamaz.");
    }

    public void oduncVer() {
        if (oduncte) throw new IllegalStateException("Bu kopya zaten ödünçte.");
        oduncte = true;
    }
    public void iadeAl() {
        if (!oduncte) throw new IllegalStateException("Bu kopya zaten kütüphanede.");
        oduncte = false;
    }
    public String getKopyaNo() { return kopyaNo; }
    public Kitap getKitap() { return kitap; }
    public boolean isOduncte() { return oduncte; }
    @Override public String toString() { return kitap.getBaslik() + " (kopya " + kopyaNo + ")"; }
}
