Aplikacje nalezy zaimportowac do Eclipse (wymagana java 8x).
Nalezy zweryfikowac czy ustawiona jest strona kodowa UTF-8.
Aby uruchomoic, nalezy prawym klawiszem myszki uruchomic plik

TrainLinesAndSchedulesDemo/src/main/java/com/example/demo/TrainLinesAndSchedulesDemoApplication.java

jako aplikacja java

Po poprawnym uruchomieniu, mozna weryfikwoac dzialanie wplikacji w oknie przegladarki podajac url:

# wyszukiwanie polaczen bezposrednich na dzien

http://localhost:8080/restapi/v1/station/services/directly/Mr%C4%85gowo/Gda%C5%84sk/2019-07-01

lub 

# wyszukiwanie polaczen z jedna przesiadka na dzien

http://localhost:8080/restapi/v1/station/services/onechange/Mr%C4%85gowo/Warszawa/2019-07-01

W pliku /TrainLinesAndSchedulesDemo/src/main/resources/data.sql
sa inserty ladujace baze danych. Baza danych jest tworzona podcza uruchomienia aplikacji.
