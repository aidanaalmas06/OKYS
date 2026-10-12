# OKYS — Tasarım

## Use case diyagramı

~~~mermaid
flowchart LR
  Gorevli[Kütüphane görevlisi]
  Uye[Kullanıcı / üye]
  Sistem((OKYS))
  KitapKaydet([Kitap ve kopya kaydet])
  KullaniciKaydet([Kullanıcı kaydet])
  Odunc([Kitap kopyası ödünç ver])
  Iade([Kitap kopyasını iade al])
  Liste([Ödünç kayıtlarını görüntüle])
  Gorevli --- Sistem
  Uye --- Sistem
  Sistem --- KitapKaydet
  Sistem --- KullaniciKaydet
  Sistem --- Odunc
  Sistem --- Iade
  Sistem --- Liste
~~~

## Class diyagramı

~~~mermaid
classDiagram
  class Kitap {
    -String baslik
    -String yazar
    -List~KitapKopyasi~ kopyalar
    +kopyaEkle(KitapKopyasi)
    +getKopyalar() List~KitapKopyasi~
  }
  class KitapKopyasi {
    -String kopyaNo
    -Kitap kitap
    -boolean oduncte
    +oduncVer()
    +iadeAl()
  }
  class Kullanici {
    -String kullaniciNo
    -String ad
  }
  class OduncKaydi {
    -Kullanici kullanici
    -KitapKopyasi kopya
    -LocalDate alisTarihi
    -LocalDate iadeTarihi
    +iadeEt(LocalDate)
  }
  Kitap "1" o-- "1..*" KitapKopyasi : kopyalarını içerir
  OduncKaydi "*" --> "1" Kullanici : alan kullanıcı
  OduncKaydi "*" --> "1" KitapKopyasi : verilen kopya
~~~

## İlişkiler
- Bir Kitap, birden fazla KitapKopyasi içerir.
- Her kopya bir kitaba bağlıdır.
- OduncKaydi, bir kullanıcıyı ve ödünç alınan kopyayı bağlar.
- Main, bu sınıflardan nesneler kurup ödünç/iade akışını gösterir.
