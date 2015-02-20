# hackathon-ucll
+All information for the hackathon at UC Leuven-Limburg in March, 2015

De volgende 3 stappen moeten enkel uitgevoerd worden indien dit nog niet gebeurd is. Deze zijn immers onderdeel van de opdrachten die op voorhand uitgevoerd moesten worden.

De installatie-bestanden kunnen jullie vinden op de NAS. De correcte locatie hiervan is verkrijgbaar bij de begeleiders.

**Ga deze bestanden niet op internet zoeken. Hier zullen jullie teveel tijd mee verliezen!**

## Installatie JDK

Afhankelijk van je Operating System ga je de juiste JVM moeten installeren.

Wij hebben alvast 5 versies voorzien:

* jdk-8u31-windows-i586.exe: 32-bits Windows
* jdk-8u31-windows-x64.exe: 64-bits Windows
* jdk-8u31-macosx-x64.dmg: MacOS X
* jdk-8u31-linux-i586.rpm: 32-bits Linux
* jdk-8u31-linux-x64.rpm: 64-bits Linux

Nadat de JVM correct is geïnstalleerd op jullie systeem, moeten de omgevingsvariabelen nog correct geplaatst worden.

### Windows
```
set JAVA_HOME=c:\program files\java\jdk1.8.0_31\
set PATH=%JAVA_HOME%\bin;%PATH%
```

### Macos X
```
export JAVA_HOME=$(/usr/libexec/java_home)
```

### Linux
```
export JAVA_HOME=/usr/java/jdk1.8.0_31/bin/java
export PATH=$PATH:/usr/java/jdk1.8.0_31/bin
```

Als finale test

1. Open een command prompt/bash/terminal venster
2. Voer het volgende commando uit:<br>
   ```
   java --version
   ```
3. Indien de JVM aan geeft dat hij Java 8 version 31 is, dan is de installatie succesvol. 

## Installatie Eclipse

## Installatie Maven

## Run Applicatie
- Bekijk logging statement "b.i.h.service.GreetingServiceImpl: Call sayHello()"

## Run JUnit Tests

## Bluemix

## Installatie CF CLI

## Deploy starter-app

## Start jullie hackathon!
- [Opdract A (AB-Inbev)](/docs/OpdrachtA.md)
- [Opdract B (IBM)](/docs/OpdrachtB.md)
- [Opdract C (ING)](/docs/OpdrachtC.md)

## Inspiratie
- http://www.ibm.com/design/language/inspiration.shtml
