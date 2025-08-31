Feature: Swag Labs uygulaması giriş senaryoları

  Scenario: Swag Labs Başarılı Login Senaryosu
    Given Giriş ekranı açılır
    When Kullanıcı adı ve şifre giriir
      | username       | password     |
      | standard_user  | secret_sauce |
    And Giriş yap butonuna tıklanır
    Then Uygulamaya giriş yapıldığı doğrulanır

  Scenario: Swag Labs Hatalı Kullanıcı Adı Senaryosu
    Given Giriş ekranı açılır
    When Kullanıcı adı ve şifre giriir
      | username       | password     |
      | test           | secret_sauce |
    And Giriş yap butonuna tıklanır
    Then Kullanıcı adı veya şifrenin hatalı olduğu doğrulanır

  Scenario: Swag Labs Hatalı Şifre Senaryosu
    Given Giriş ekranı açılır
    When Kullanıcı adı ve şifre giriir
      | username       | password     |
      | standard_user  | test         |
    And Giriş yap butonuna tıklanır
    Then Kullanıcı adı veya şifrenin hatalı olduğu doğrulanır

  Scenario: Swag Labs Boş Kullanıcı Adı Senaryosu
    Given Giriş ekranı açılır
    When Kullanıcı adı ve şifre giriir
      | username       | password     |
      |                | test         |
    And Giriş yap butonuna tıklanır
    Then Kullanıcı adının boş bırakıldığı doğrulanır

  Scenario: Swag Labs Boş Şifre Senaryosu
    Given Giriş ekranı açılır
    When Kullanıcı adı ve şifre giriir
      | username       | password     |
      | standard_user  |              |
    And Giriş yap butonuna tıklanır
    Then Şifrenin boş bırakıldığı doğrulanır