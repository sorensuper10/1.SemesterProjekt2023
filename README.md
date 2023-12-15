# Projekt December 2023

Projektet omhandler udvikling af program til track 'n' trace.
På nuværende tidspunkt er der lavet til at man kan skrive information ind til databasen via statisk input i koden.
Dette kan bruges til følgende oprettelser:
- En kunde
- En pakke
- Et firma
- En lokation
- Transportinfo

  Man kan også søge på følgende emner:
- Man kan få al information omkring kunder, pakker, firmaer, lokationer og transportinfo udskrevet gennem flere arraylister.
- Kunde, man kan søge på en kunde gennem et kundeID
- Pakke, man kan søge på en pakke gennem et pakkeID
- Firma, man kan søge på et firma gennem et firmaID

Søgningerne bliver udskrevet i konsollen.

Det er muligt at redigere i forskellige ting gennem søgninger på id.
Dette kan gøres på forskellige elementer (se punkt 18-23 i switch).

Switch er blevet etableret i koden med scanner input.
Følgende funktioner kan køres på nuværende tidspunkt:

1. Opretter bruger med statiske værdier
2. Opretter pakke med statiske værdier
3. Opretter firma med statiske værdier
4. Opretter lokation med statiske værdier
5. Opretter transportinfo med statiske værdier
6. Udskriver alle kunder i tabellen costumerTabel gennem arraylist
7. Udskriver alle pakker i tabellen packageTabel gennem arraylist
8. Udskriver alle firmaer i tabellen companyTabel gennem arraylist
9. Udskriver alle lokationer i tabellen locationTabel gennem arraylist
10. Udskriver alle transportinfo i tabellen transportationInfoTabelTabel gennem arraylist
11. Søger efter statisk kunde id
12. Søger efter statisk pakke id
13. Søger efter statisk firma id
14. Sletter kunde angived med statisk id
15. Sletter pakke angived med statisk id
16. Sletter firma angived med statisk id
17. Giver mulighed for at skifte kunde fornavn ved at søge på id gennem scanner
18. Giver mulighed for at skifte kunde efternavn ved at søge på id gennem scanner
19. Giver mulighed for at skifte kunde adresse ved at søge på id gennem scanner
20. Giver mulighed for at skifte kunde postnummer ved at søge på id gennem scanner
21. Giver mulighed for at skifte kunde telefon nr ved at søge på id gennem scanner
22. Giver mulighed for at skifte kunde mail ved at søge på id gennem scanner
23. Udskriver en kundes pakker i tabellen kundePakker gennem arraylist ved at søge på id gennem scanner
24. Udskriver et firmas pakker i tabellen firmaPakker gennem arraylist ved at søge på id gennem scanner
25. Launcher GUI

Ved brug af GUI virker alle knapperne på nuværende tidspunkt.
Et forslag til en menu kunne se ud på følgende måde:
![TrackandTrace](https://github.com/sorensuper10/1.SemesterProjekt2023/assets/89455430/72f46338-1d46-45ca-a69a-3239919898ec)

Hvis man trykker på opret kunde kommer denne skærm frem hvor man kan oprette en kunde.

![Opret bruger](https://github.com/sorensuper10/1.SemesterProjekt2023/assets/89455430/911a8374-54d1-4435-a850-3fdba82eaf44)

Hvis man trykker på slet kunde kommer denne skærm frem hvor man kan slette en kunde.

![Slet bruger](https://github.com/sorensuper10/1.SemesterProjekt2023/assets/89455430/a77930bc-326e-45cd-8b87-aa0788454a64)

Hvis man trykker på søg kunde kommer denne skærm frem hvor man kan søge på en kunde.

![Søg bruger](https://github.com/sorensuper10/1.SemesterProjekt2023/assets/89455430/e115b84a-38f7-4be7-bd89-4920049e45d3)

De andre knapper virker på samme måde bare med pakker og firmaer.

Fremtidige muligheder:
- Oprettelse af kunde via scanner input.
- Oprettelse af pakke via scanner input.
- Redigering af pakke placering via scanner input.
- Søgning på kunder via scanner input.
- Søgning på pakker via scanner input.
- - Denne kan videreudvikles til også at udskrive opdateringer på pakken. Dette skal være alt information der ligger omkring den pakke (id) i update tabellen.
- Potentielt inførsel af fuld GUI (komplet program).
- Lav en klasse til use cases.
