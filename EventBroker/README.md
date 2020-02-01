# EventBroker
Napisz trzy wersje aplikacji do drzew genealogicznych, przy użyciu trzech różnych wzorców, w której obiekty klasy Osoba będą zarówno informować o zmianach u nich zachodzących, jak i będą informowane o zmianach w ramach ich bezpośrednich krewnych.

Zmiany do implementacji:

- jeśli zmienione zostanie imię i nazwisko Osoby, informowani o tym będą rodzice oraz dzieci tej Osoby,

- jeśli zostanie zmieniona data urodzin Osoby, informowany będzie obiekt matki Osoby,

- jeśli Osobie przybędzie dzieci, informowane będą wszystkie dzieci Osoby.

Obiekty informowane powinny reagować na uzyskaną informację wyświetlając napisy:

- "<imię i nazwisko odbiorcy>: Obecnie <imię i nazwisko> nazywa się <nowe imię i nazwisko>"

- "<imię i nazwisko odbiorcy>: Moje dziecko urodziło się nie <stara data>, a <nowa data>"

- "<imię i nazwisko odbiorcy>: Mam nowe rodzeństwo: <imię i nazwisko>"

W programie głównym należy skonstruować sześć obiektów: dwoje rodziców Osoby, Osobę, małżonka Osoby i ich dwoje dzieci. Następnie należy zmienić imię i nazwisko Osoby, zmienić datę urodzin Osoby i stworzyć nowe dziecko Osoby i jego małżonka.
