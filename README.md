# hackathon-ucll
+All information for the hackathon at UC Leuven-Limburg in March, 2015

De volgende 3 stappen moeten enkel uitgevoerd worden indien dit nog niet gebeurd is. Deze zijn immers onderdeel van de opdrachten die op voorhand uitgevoerd moesten worden.

De installatie-bestanden kunnen jullie vinden op de NAS. De correcte locatie hiervan is verkrijgbaar bij de begeleiders.

**Ga deze bestanden niet op internet zoeken. Hier zullen jullie teveel tijd mee verliezen!**

## Installatie JDK

Afhankelijk van je Operating System ga je de juiste JVM moeten installeren. Deze zijn afkomstig van de Oracle site: http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html

Wij hebben alvast 5 versies voorzien:

* jdk-7u75-windows-i586.exe: 32-bits Windows
* jdk-7u75-windows-x64.exe: 64-bits Windows
* jdk-7u75-macosx-x64.dmg: MacOS X
* jdk-7u75-linux-i586.rpm: 32-bits Linux
* jdk-7u75-linux-x64.rpm: 64-bits Linux

Nadat de JVM correct is geïnstalleerd op jullie systeem, moeten de omgevingsvariabelen nog correct geplaatst worden.

### Windows
```
set JAVA_HOME=c:\program files\java\jdk1.7.0_75\
set PATH=%JAVA_HOME%\bin;%PATH%
```

### Macos X
```
export JAVA_HOME=$(/usr/libexec/java_home)
```

### Linux
```
export JAVA_HOME=/usr/java/jdk1.7.0_75/bin/java
export PATH=$PATH:/usr/java/jdk1.7.0_75/bin
```

### Finale test

1. Open een command prompt/bash/terminal venster
2. Voer het volgende commando uit:<br>
   ```
   java --version
   ```
3. Indien de JVM aan geeft dat hij Java 7 version 75 is, dan is de installatie succesvol. 

## Installatie Maven

Maven is een tool om je project te compileren en te bundelen naar een file die geïnstalleerd kan worden op een application server. In de beschrijving van je project (pom.xml) ga je ook de vereiste libraries definiëren die je wil gebruiken in je source code.

Deze applicatie kan je downloaden via http://maven.apache.org/download.cgi waar je ook de juiste versie voor jouw OS moet selecteren.

De maven installatie is altijd een gecomprimeerd bestand, hetwelke je kan extracten naar je lokale file system. Je gaat nadien net als bij de JVM nog de juiste omgevingsvariablen moeten plaatsen.

### Windows
```
set M2_HOME=c:\program files\java\jdk1.7.0_75\
set PATH=%M2_HOME%\bin;%PATH%
```

### Macos X
```
export JAVA_HOME=De locatie van je maven installatie
```

### Linux
```
export JAVA_HOME=De locatie van je maven installatie
export PATH=$PATH:/usr/java/jdk1.7.0_75/bin
```

### Finale test

1. Open een command prompt/bash/terminal venster
2. Voer het volgende commando uit:<br>
   ```
   mvn --version
   ```
3. Indien Maven opstart en de nodige versie-informatie weer geeft, dan is de installatie succesvol. 

## Installatie Eclipse

Ook voor Eclipse zijn er verschillende versies afhankelijk van je Operating System. Op http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/lunasr1a kan je rechts de download links vinden voor de laatste versie van deze IDE.

De Eclipse download is net als de maven installatie een gecomprimeerd bestand waarin 1 hoofd-folder staat. Deze kan je extracten naar een locatie op je harde schijf. (bv naar de c:\, /Macintosh HD/Applications, etc)

### Instellen standaard JDK

Open het Preferences menu via: Window => Preferences
Navigeer daarin naar Java => Installed JREs en voeg uw geïnstalleerde JDK toe en zet deze vervolgens als de default JDK.

### Instellen Maven

Navigeer in het preferences menu naar Maven => Installations en voeg daar uw lokaal geinstalleerde Maven versie toe en zet deze als de default in plaats van de embedded.

## Run Applicatie
- Bekijk logging statement "b.i.h.service.GreetingServiceImpl: Call sayHello()"

## Installatie CF CLI

De Cloud Foundry Command Line Interface is een set van commando's die je kan uitvoeren om van op je lokale computer de nodige handelingen uit te voeren op bluemix. Dit kan gaan van het installeren van een nieuwe versie van de applicatie tot het bekijken van de logs en zelfs het stoppen en starten van je applicatie.

De laatste versie van deze commando's kan je vinden via https://github.com/cloudfoundry/cli/releases

### Windows

1. Unzip het bestand
2. Dubbelklik de cf exe
3. Klik op install, en vervolgens op close

### OS X/Linux installatie

1. Open het .pkg bestand.
2. Klik op continue in de wizard
3. Selecteer een installatiefolder, en klik op volgende
4. Klik op install

### Finale test

Om zeker te zijn dat alles correct geinstalleerd is open je een terminal en typ is 'cf' in. Als alles correct gegaan is zou je de help te zien moeten krijgen.

Voor meer informatie in verband met Cloud Foundry CLI 6 kijk je best eens naar de
<a href="http://docs.cloudfoundry.org/devguide/installcf/whats-new-v6.html">Getting Started</a>

## Start jullie hackathon!
- [Opdract A (AB-Inbev)](/docs/OpdrachtA.md)
- [Opdract B (IBM)](/docs/OpdrachtB.md)
- [Opdract C (ING)](/docs/OpdrachtC.md)

## Inspiratie
- [http://expo.getbootstrap.com](http://expo.getbootstrap.com)
- [http://foundation.zurb.com](http://foundation.zurb.com)
- [http://patterntap.com](http://patterntap.com)
- [http://plugins.jquery.com](http://plugins.jquery.com)
- [http://web.appstorm.net](http://web.appstorm.net)
- [http://www.dribbble.com/tags/interface](http://www.dribbble.com/tags/interface)
- [http://www.getbootstrap.com](http://www.getbootstrap.com)
- [http://www.google.com/design](http://www.google.com/design)
- [http://www.ibm.com/design/language/inspiration.shtml](http://www.ibm.com/design/language/inspiration.shtml)
- [http://www.learningjquery.com](http://www.learningjquery.com)
- [http://www.mediaqueri.es](http://www.mediaqueri.es)
- [http://www.webappers.com](http://www.webappers.com)

