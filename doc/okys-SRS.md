# OKYS — Gereksinimler

## Amaç ve kapsam
OKYS (Okul Kütüphanesi Yönetim Sistemi), kitapları ve fiziksel kopyalarını takip eden; kullanıcıların kopyaları ödünç alıp iade etmesini örnekleyen konsol uygulamasıdır. Veriler bellekte tutulur, kalıcı kayıt yoktur.

## Aktörler
- Kütüphane görevlisi: kitap/kopya ve kullanıcı kaydeder, ödünç/iade işlemlerini yürütür.
- Kullanıcı/üye: kitap kopyası ödünç alır ve iade eder.

## İşlevsel gereksinimler
1. Kitap başlık ve yazar ile tanımlanır.
2. Kitaba bir veya daha fazla numaralı fiziksel kopya bağlanır.
3. Kullanıcı numarası ve adıyla tanımlanır.
4. Kullanılabilir kopya ödünç verilir; ödünçteki kopya tekrar verilemez.
5. Ödünç kaydı kullanıcıyı, kopyayı, alış tarihini ve varsa iade tarihini tutar.
6. İade edilen kopya yeniden kullanılabilir olur.

## Kapsam dışı
Veritabanı, kullanıcı girişi, gecikme cezası ve eşzamanlı işlem bu örnekte yoktur.
