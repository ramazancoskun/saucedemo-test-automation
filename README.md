# Java Test Otomasyon Template 🚀

Page Object Model (POM) ve Cucumber (BDD) tabanlı test otomasyon projesi için temel klasörleme yapısı ve mimariyi sunar.
Bu şablon, hazır bir iskelet sağlar; aynı zamanda proje bazlı ihtiyaçlara göre kolayca özelleştirilebilir.

## Anahtar Noktalar

- **Mimari:** Page Object Model (POM) + Cucumber (BDD)
- **Driver Yönetimi:** `DriverFactory` ile merkezi tarayıcı yönetimi
- **Hooks:** Setup & teardown izolasyonu
- **Utils Paketi:** DB, beklemeler, element etkileşimleri
- **Konfigürasyon:** `config.properties` ile esnek yapılandırma
- **Etiket Bazlı Koşum:** Örn. `@smoke`, `@regression`

## 📂 Klasör Yapısı
```text
src
├─ main/java
│ ├─ driver/ # Tarayıcı ve WebDriver yönetimi
│ ├─ hooks/ # Test başlatma ve bitirme işlemleri (setup/teardown)
│ └─ utils/ # Yardımcı fonksiyonlar: DB, beklemeler, element etkileşimleri, config
└─ test/java
├─ base/ # Tüm sayfaların temel sınıfı (BasePage)
├─ pageElements/ # Sayfa elementlerini ayrı tutmak için klasör
├─ pages/ # Sayfa nesneleri (Page Object)
└─ runners/ # Test çalıştırıcıları
├─ stepDefinitions/ # Cucumber step tanımları

resources
├─ features/ # Cucumber feature dosyaları
└─ config.properties # Proje ayarları ve konfigürasyon
```

## ⚙ Kurulum

```bash
git clone https://github.com/ramazancoskun/SeleniumBDDFramework.git
cd <repo>
mvn clean test
```

## 🛠 Konfigürasyon

Tüm yapılandırmalar src/test/resources/config.properties dosyasında yapılır.

## 📊 Raporlama

Varsayılan: HTML rapor (target/cucumber-report.html)

İsteğe bağlı: Allure, Extent

## 🔗 CI/CD

GitHub Actions veya benzeri CI ortamlarında kolayca entegre edilebilir.


