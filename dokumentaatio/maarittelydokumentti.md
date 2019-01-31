# Määrittelydokumentti

## Algoritmit ja tietorakenteet
Ohjelmassa käytetään erilaisia kivi-paperi-sakset-algoritmeja. Erilaiset algoritmit käyttävät erilaista taktiikkaa yrittääkseen voittaa pelaajan, toiset yksinkertaisempia kuin toiset.

## Ongelma/syyt
Mikäli kivi-paperi-sakset peliä pelaa vähintään toinen pelaajista sattumanvaraisesti voitot, häviöt ja tasapelit jakautavat tasaisesti, kun otteluita pelataan riittävä määrä. Kiinassa tehdyn tutkimuksen mukaan ihmiset eivät kuitenkaan yleensä pelaa sattumanvaraisesti, vaan tiedostamattaan käyttävät taktiikkaa, jossa voiton jälkeen useammin valitsevat saman vaihtoehdon kuin jonkin muun ja tappion jälkeen useammin valitsevat sen vaihtoehdon jolla olisi voittanut vastustajan. Paremmin menestyvät pelaajat tutkimuksen mukaan tunnistavat muiden pelaavan tuolla tavalla ja säätävät oman taktiikkansa sen mukaan.

Ohjelmassa toteutetaan algoritmit, jotka pelaavat molemmilla edellä mainituilla taktiikoilla. Lisäksi haluan kehittää algoritmin joka tunnistaa, kummalla edellä mainitusta taktiikoista ihminen pelaa ja voittaa ihmisen.

## Syötteet
Ohjelmassa suureksi osin saadaan syötteenä pelaajan valinta (joko kivi, paperi tai sakset), ja tietoja käytetään algoritmista riippuen. Jokin algoritmi pitää kirjaa vain pelaajan edellisestä valinnasta, ja kehittyneemmät algoritmit voivat muistaa useita pelaajan valintoja ja niiden yhteyttä päättäessään seuraavaa valintaa.

## Aika- ja tilavaativuudet
Aika- ja tilavaativuudet eivät ole vielä loppuun suunniteltuja. Tavoitteena on pyrkiä vakiotilavaativuuteen (tai algoritmista riippuvaan tilavaativuuteen, joka ei kasva ohjelman aikana), kunhan kierrosten maksimimäärä on rajoitettu. Kirjanpitoon voidaan käyttää vakioverran tilaa vievää ehkä taulukkoa (kuinka suuri riippuu algoritmista) ja tämän käsittely vie tällöin vakioverran aikaa kierrosta kohden. Kokonaisaikaa kasvattaa eniten ihmisen valintoihin kuluva aika. Nyt olemassa olevilla algoritmeilla on vakiotilavaativuus ja kierrosta kohden vakioaikavaativuus.

## Lähteet
Social cycling and conditional responses in the Rock-Paper-Scissors game" Zhijian Wang, Bin Xu, Hai-Jun Zhou. Scientific Reports 4, 5830 (2014) https://www.nature.com/articles/srep05830
