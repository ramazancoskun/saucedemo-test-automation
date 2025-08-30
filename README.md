Java Test Otomasyon Template

Hafif ve profesyonel bir test otomasyon iskeleti – hızlı başlangıç için.



🚀 Anahtar Noktalar

Page Object Model (POM) + Cucumber (BDD) tabanlı modern mimari.

DriverFactory ile merkezi tarayıcı yönetimi.

Hooks üzerinden setup & teardown izolasyonu.

Utils paketi: DB, beklemeler, element etkileşimleri.

config.properties ile esnek yapılandırma.

Etiket bazlı koşum (örn. @smoke, @regression).

📂 Klasör Yapısı

src
├─ main/java
│  ├─ driver/DriverFactory.java
│  ├─ hooks/
│  └─ utils/ (Browser, DB, Wait, Config...)
└─ test/java
├─ base/BasePage.java
├─ pages/TestPage.java
├─ stepDefinitions/TestStepDef.java
└─ runners/TestRunner.java

resources
├─ features/test.feature
└─ config.properties

⚙ Kurulum

git clone https://github.com/<kullanici>/<repo>.git
cd <repo>
mvn clean test

Konfigürasyon src/test/resources/config.properties dosyasında yapılır.

📊 Raporlama

Varsayılan HTML rapor (target/cucumber-report.html).

İsteğe bağlı: Allure, Extent.

🔗 CI/CD

GitHub Actions veya benzeri CI ortamlarında kolayca entegre edilebilir. Örnek workflow ile headless test koşumu sağlanır.

📜 Lisans

MIT (veya tercih edilen lisans).
