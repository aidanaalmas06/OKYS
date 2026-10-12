# OKYS — Okul Kütüphanesi Yönetim Sistemi

Java ile yazılmış basit bir kütüphane ödünç/iade örneğidir. Bir kitap birden fazla fiziksel kopyaya sahip olabilir; ödünç kaydı bir kullanıcıyı ödünç aldığı kopyaya bağlar.

## Çalıştırma

JDK 21+ ile proje klasöründe:

```sh
javac -d out src/*.java
java -cp out Main
```

Program örnek bir kitap, iki kitap kopyası, bir kullanıcı ve ödünç kaydı oluşturur; ödünç alma ve iade durumunu gösterir.

- Gereksinimler: [doc/okys-SRS.md](doc/okys-SRS.md)
- Tasarım ve UML diyagramları: [doc/okys-DESIGN.md](doc/okys-DESIGN.md)
# OKYS — Okul Kütüphanesi Yönetim Sistemi

Java ile yazılmış basit bir kütüphane ödünç/iade uygulamasıdır. Bir kitap birden fazla fiziksel kopyaya sahip olabilir; ödünç kaydı kullanıcıyı kopyaya bağlar.

## Çalıştırma

JDK 21+ proje klasöründe:

```sh
javac *.java
java Main
```

Program örnek kullanıcı, kitap, kopyalar ve ödünç kaydı oluşturur. Önce ödünç durumunu, ardından iade sonrası durumu gösterir. Gereksinimler ve UML diyagramları `okys-SRS.md` ile `okys-DESIGN.md` dosyalarındadır.
