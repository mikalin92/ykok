# ykok
Yleiskäyttäjän Ohjelmointikieli


Uusi kieli opetuskäyttöön 13-17 vuotiaille, ellei vanhemmillekin ohjemoinnista kiinnostuneille.

Lue käyttäjän opas (tulossa pian!)
# Yleiskäyttäjän konsoli
Yleiskäyttäjän konsolin asennus:

Lataa Java SDK 9.0.1 tai vastaava ja lisää se PATH osioon
https://www.java.com/en/download/help/path.html

Java JDK 9.0.4 käy myös:
https://jdk.java.net/archive/

Pura kansio 7-zipillä kahdesti ja siirrä sen sisältö kansioon c:/java/

Windows 10:ssä voit asentaa pathin kirjoittamalla hakuun Muokkaa järjestelmän ympäristömuuttujia.
Kirjota muuttujaan Path uusi muuttuja
c:/java/jdk-9.0.4/bin/

ks. kuva ympmuut.png


Lisää ykok/uuskieli kohteeseen c: (C-asema)

Lisää pikakuvake työpöydälle
YK-OK konsoli.lnk
tai tee itse uusi pikakuvake:


C:\Windows\System32\cmd.exe /k echo Yleiskäyttäjän konsoli, versio 1.00 && cd c:/ykok &&  javac -encoding utf-8 c:/ykok/uuskieli/*.java && java uuskieli/Main

Testaus:

Yleiskäyttäjän konsoli, versio x.xx


YK-OK>lue-komennot-tiedostosta c:/temp/fiboloop.ykok


YK-OK>suorita

# Tuetut editorit

## Vim:

Asenna VIM https://www.vim.org/

Vaihda asetuksista suomenkieliseksi. Lisää Vim kansion sisältö koneesi Vim kansioon. Tämä lisää yleiskäyttäjän ohjelmointikielen Vim-tekstieditoriin ja samalla määrittää sen Windowsmaiseksi.
INSERT-näppäin on Vim editorin kanssa kätevä, tällöin päästään SYÖTTÖ-moodiin.


Alfa-kokeilu-asteella. Lisää toiminnallisuutta tulossa pian, kuten graafinen ohjelmointi! lue LICENCE




