Feature: CertificateSearch
Scenario: Search Test
  When I open page "https://certificate.ithillel.ua/"
  And Enter keys "1214252553" in  search field
  Then Get message "Сертифікат не знайдено"






