<h1>Maven installeren</h1>

Voor deze hackaton gaan we gebruikmaken van Maven voor het builden, en managen van de dependencies van onze Java code.

<h2>Vereisten</h2>

JRE/JDK 1.7

<h2>Installatie instructies</h2>

Maven vereist geen installer, kopieer de 32/64 bits versie (afhankelijk van de geinstalleerde Java versie) naar de gewenste directory en extract deze.

<h2>Omgevingsvariabelen instellen</h2>

<h3>Windows</h3>

Open de Windows Environment variables en voer de volgende wijzigingen uit:

<ul>
    <li>voeg een variabele met de naam: M2_HOME toe, deze wijst naar de root directory van de maven installatie</li>
    <li>voeg aan de PATH variabele: %M2\_HOME%\bin toe</li>
</ul>

<h3>Non Windows</h3>

Voer het volgende commando uit: export PATH=$PATH:MAVEN\_INSTALLATION\_DIRECTORY

<h3>Optioneel</h3>

Je kan een MAVEN\_OPTS variabele toevoegen om bepaalde opties in te stellen zoals maximaal geheugengebruik.

<h2>Nakijken of alles werkt</h2>
Voer in een terminal het commando 'mvn -version' uit. Indien u een foutmelding krijgt kijk dan na of uw JAVA\_HOME en M2\_HOME variabelen correct gedeclareerd zijn.
