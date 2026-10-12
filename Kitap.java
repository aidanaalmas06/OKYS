import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Kitap {
    private final String baslik;
    private final String yazar;
    private final List<KitapKopyasi> kopyalar = new ArrayList<>();

    public Kitap(String baslik, String yazar) {
        this.baslik = Objects.requireNonNull(baslik, "Başlık boş olamaz.");
        this.yazar = Objects.requireNonNull(yazar, "Yazar boş olamaz.");
    }

    public void kopyaEkle(KitapKopyasi kopya) {
        Objects.requireNonNull(kopya, "Kopya boş olamaz.");
        if (kopya.getKitap() != this) throw new IllegalArgumentException("Kopya bu kitaba bağlı olmalıdır.");
        kopyalar.add(kopya);
    }

    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public List<KitapKopyasi> getKopyalar() { return Collections.unmodifiableList(kopyalar); }
    @Override public String toString() { return baslik + " — " + yazar; }
}
