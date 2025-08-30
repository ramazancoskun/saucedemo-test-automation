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
│  ├─ driver/DriverFactory.java
│  ├─ hooks/
│  └─ utils/  (Browser, DB, Wait, Config...)
└─ test/java
   ├─ base/BasePage.java
   ├─ pages/TestPage.java
   ├─ stepDefinitions/TestStepDef.java
   └─ runners/TestRunner.java

resources
├─ features/test.feature
└─ config.properties
```

## ⚙ Kurulum

```bash
git clone https://github.com/<kullanici>/<repo>.git
cd <repo>
mvn clean test
```

## 🛠 Konfigürasyon

Tüm yapılandırmalar src/test/resources/config.properties dosyasında yapılır.

## 📊 Raporlama

Tüm yapılandırmalar src/test/resources/config.properties dosyasında yapılır.

## 🔗 CI/CD

GitHub Actions veya benzeri CI ortamlarında kolayca entegre edilebilir.


