# StanWzorzec

Wnioski do Urzędu Skarbowego przechodzą skomplikowane zmiany w zależności od wielu czynników. Wnioski mogą być 
- Złożone - jeśli klient złoży wniosek
- Przyjęte - jeśli rozpoczęto procedowanie wniosku
- Przekierowane - jeśli wniosek wpłynął do błędnego Urzędu Skarbowego
- Zaakceptowane - jeśli wniosek został zatwierdzony
- Odrzucone - jeśli wniosek został odrzucony
- Anulowany - jeśli wniosek został wycofany
- Zamknięty - jeśli minęło już 30 dni od decyzji w sprawie wniosku

Akcje:
- złóż(DaneWniosku) - tworzy wniosek
- sprawdź(Wniosek, Urząd) - przetwarza wniosek

Zmiana stanu wniosku zmienia datę aktualizacji wniosku i od tej daty liczą się poszczególne minuty.

Warunki
Wniosek nowo dodany staje się Złożony.
Wniosek Złożony staje się Przyjęty po minucie.
Wniosek Przyjęty staje się Przekierowany, jeśli nr Urzędu Skarbowego we wniosku jest inny, niż podany w parametrze.
Wniosek Przyjęty staje się Zaakceptowany po trzech minutach.
Wniosek Przyjęty staje się Odrzucony, jeśli składający wniosek ma nazwisko składające się z samych spółgłosek.
Wniosek Przyjęty staje się Anulowany, jeśli składający wniosek ma nazwisko składające się z samych samogłosek.
Wniosek Przekierowany staje się Przyjęty, jeśli nr Urzędu już się zgadza, czyli jeśli ktoś zmienił kontekst sprawdzenia wniosku.
Wniosek Zaakceptowany staje się Zamknięty po pięciu minutach.
Wniosek Odrzucony staje się Zamknięty po sześciu minutach.
Wniosek Anulowany staje się Zamknięty po czterech minutach.
