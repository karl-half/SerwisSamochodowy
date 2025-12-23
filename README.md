# System zarządzania Serwisem Samochodowym
* Projekt szkolny - serwis samochodowy

### Opis projektu
* Projekt przedstawia prostą aplikację konsolową napisaną w języku Java, służącą do zarządzania warsztatem samochodowym. Umożliwia ona obsługę mechaników, samochodów oraz zleceń napraw wraz z ich realizacją i płatnościami.

* Aplikacja działa w trybie tekstowym i komunikuje się z użytkownikiem za pomocą menu w konsoli.

### Funkcjonalności

* Aplikacja umożliwia:

  - tworzenie nowych zleceń naprawy,
  - przypisywanie mechanika oraz samochodu do zlecenia,
  - wybór typu naprawy oraz metody płatności,
  - wykonywanie zleceń,
  - opłcanie wykonanych zleceń,
  - przeglądanie listy wszystkich zleceń (raport).

### Struktura danych

* Program korzysta z kolekcji LinkedList do przechowywania:
  - listy mechaników (Mechanic),
  - listy samochodów (Car),
  - listy zleceń (Order).

* Dodatkowo wykorzystywane są:
  - enum RepairType – określający typ naprawy,
  - enum PaymentType – określający sposób płatności.

### Menu główne

* Po uruchomieniu programu użytkownik ma do wyboru następujące opcje:
  1. Utwórz zlecenie
     - wybór mechanika
     - wybór samochodu 
     - opis naprawy 
     - typ naprawy 
     - sposób płatności 
  2. Wykonaj zlecenie
     - oznaczenie wybranego zlecenia jako wykonane
  3. Sprawdź zlecenia / raporty
     - wyświetlenie listy wszystkich zleceń 
  4. Zapłać za zlecenie
     - realizacja płatności za wybrane zlecenie
  5. Wyjście
     - zakończenie działania programu

### Wymagania
* Java 17 lub nowsza (lub zgodna z używanymi konstrukcjami),
* środowisko uruchomieniowe obsługujące aplikacje konsolowe.


### Autor

* Projekt edukacyjny – przykład prostej aplikacji konsolowej do zarządzania warsztatem samochodowym.
* Zaprojektował i napisał Karol Połowniak