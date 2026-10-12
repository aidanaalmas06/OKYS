# OKYS — Gereksinimler

## Amaç ve kapsam
OKYS (Okul Kütüphanesi Yönetim Sistemi), kitapları ve fiziksel kopyalarını takip eden; kullanıcıların kopyaları ödünç alıp iade etmesini örnekleyen konsol uygulamasıdır. Bu ödev sürümü verileri bellekte tutar, kalıcı kayıt içermez.

## Aktörler
- **Kütüphane görevlisi:** Kitap/kopya ve kullanıcı kaydeder, ödünç verme ve iade işlemlerini yürütür.
- **Kullanıcı/üye:** Kitap kopyası ödünç alır ve iade eder.

## İşlevsel gereksinimler
1. Kitap başlık ve yazar bilgisiyle tanımlanır.
2. Bir kitaba bir veya daha fazla fiziksel kopya bağlanır; her kopyanın numarası ve ödünç durumu bulunur.
3. Kullanıcı, numarası ve adıyla tanımlanır.
4. Kullanılabilir kopya ödünç verilir.
5. Ödünç kaydı; kullanıcıyı, kopyayı, alış tarihini ve varsa iade tarihini tutar.
6. İade edilen kopya yeniden kullanılabilir olur.
7. Ödünçte olan kopya tekrar verilemez.

## Kapsam dışı
Veritabanı, kullanıcı girişi, gecikme cezası ve eşzamanlı işlem bu örnek sürümde yoktur.
