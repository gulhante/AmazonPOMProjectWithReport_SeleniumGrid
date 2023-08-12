# Amazon Website Automation Test

Dieses Projekt enthält automatisierte Test-Szenarien, um die Funktionalität der Amazon-Website zu überprüfen. Die Tests wurden mit [Selenium](https://www.selenium.dev/) und [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) unter Verwendung des Page Object Models entwickelt. Die Testergebnisse werden sowohl in Allure Reports als auch in HTML Reports protokolliert.

## Voraussetzungen

- Stellen Sie sicher, dass Java 11 JDK auf Ihrem System installiert ist.
- Abhängigkeit von Selenium WebDriver.

## Installation

1. Stellen Sie sicher, dass Java 11 JDK auf Ihrem System installiert ist.
2. Verwenden Sie die Datei "pom.xml" im Hauptverzeichnis, um die erforderlichen Abhängigkeiten automatisch herunterzuladen.

## Testausführung

1. Führen Sie die Tests mit folgendem Befehl aus:

   ```bash
   mvn test

   
Der Befehl führt die Test-Szenarien automatisch aus und zeigt die Ergebnisse auf dem Bildschirm an.


Testberichte

Dieses Projekt nutzt sowohl Allure Report als auch HTML Report für die Testergebnisse.

Allure Report: Der Allure Report bietet eine detaillierte Darstellung der Testergebnisse, einschließlich Teststatus, Fehlermeldungen, Screenshots und Zeitleiste. Sie können den Allure Report öffnen, indem Sie folgenden Befehl ausführen:

Terminal
- mvn clean test
- allure serve
- allure-results


Nachdem der Befehl ausgeführt wurde, öffnet sich der Allure Report in Ihrem Standardwebbrowser.

HTML Report: Der HTML Report wird automatisch generiert und befindet sich im Verzeichnis "target\surefire-reports". Sie können die HTML-Berichte öffnen, indem Sie die entsprechenden Dateien in einem Webbrowser öffnen.

Anmerkungen

Stellen Sie sicher, dass Ihre Internetverbindung und der Chrome-Browser aktuell sind, um die Tests erfolgreich auszuführen.
Testergebnisse können in der Konsole und/oder in den generierten Testberichten angezeigt werden, abhängig von der Konfiguration im Test.
Kontakt
Für Fragen, Probleme oder Feedback kontaktieren Sie uns bitte unter [Ihre E-Mail-Adresse hier einfügen].

Hinweis: Dies ist nur ein Beispiel für eine "ReadMe"-Datei für ein automatisiertes Testprojekt für Amazon, das Java 11 und Maven verwendet und sowohl Allure Report als auch HTML Report für die Testergebnisse nutzt. Passen Sie den Inhalt entsprechend den spezifischen Anforderungen und Test-Szenarien Ihres Projekts an.
