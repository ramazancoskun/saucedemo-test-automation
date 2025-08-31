Feature: Swag Labs uygulaması giriş senaryoları

  Scenario: Swag Labs Başarılı Login Senaryosu
    Given Giriş ekranı açılır
    When Kullanıcı adı ve şifre giriir
    | username       | password     |
    | standard_user  | secret_sauce |
    And Giriş yap butonuna tıklanır
    Then Uygulamaya giriş yapıldığı doğrulanır
