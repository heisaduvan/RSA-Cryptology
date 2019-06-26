# RSA-Cryptology

Bir açık anahtarlı şifreleme yöntemi olan RSA, 1977 yılında Ron Rives, Adi Shamir ve Leonard Aldeman tarafından bulunmuştur. Şifreleme yönteminin adı da bu üç kişinin soy isimlerinin baş harflerinden oluşur. 

ÇALIŞMASI:

1- Yeterince büyük iki adet asal sayı seçilir: Bu sayılar p ve q olsunlar.

2- n=p*q hesaplanır. Buradaki n sayısı iki asal sayının çarpımıdır ve hem public hem de private şifreler için taban (modulus) olarak kabul eder.

3- Totient fonksiyonu hesaplanır. Bu örnek için çarpanların ikisi de asal sayı olduğu için φ(n) = (p-1)*(q-1) olarak bulunur.

4- Hesaplanan totient fonksiyonu değeri (φ(n) ) ile aralarında asal olan öyle bir e sayısı alınır ki 1 < e < φ(n) olmalıdır. Bu seçilen e sayısı public anahtar olarak ilan edilebilir.

5- d gibi bir sayı hesaplanır ki bu sayı için şu denklik geçerli olmalıdır : d*e ≡ 1 mod ( n ).

ŞİFRELEME İŞLEMİ

Şifreleme işlemi için public şifre olan (n,e) ikilisi kullanılır.

c = (m^e) mod n

Burada m, şifrelenecek olan açık metinin ASCII kodudur.

ŞİFRENİN AÇILMASI

Private anahtarımız olan (n,d) ikilisi aşağıdaki şekilde kullanılarak şifreli metin çözülür.

m = (c^d) mod n

Burada açılacak olan şifrelenmiş metin c, private anahtar ise d ile gösterilmiştir. n ise taban değeri olan modulus’tur.

Konuyla ilgili medium hesabımdaki yazım için : https://medium.com/@isaduvan/rsa-algoritmas%C4%B1-nedir-nas%C4%B1l-%C3%A7al%C4%B1%C5%9F%C4%B1r-bc351e63364c

README.md dosyası Şadi Evren Şeker'in 2008 yılında kendi sitesinde yayınladığı yazısından alıntılanmıştır. 


# KAYNAK

1- http://bilgisayarkavramlari.sadievrenseker.com/2008/03/19/rsa/

2- https://www.youtube.com/watch?v=BUZ7vwTSYVE
