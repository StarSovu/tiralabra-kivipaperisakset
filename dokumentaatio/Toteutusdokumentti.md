## Ohjelman yleisrakenne
Ohjelmassa on main-luokka, jossa rakenne ei ole kunnossa. Siinä kysytään käyttäjältä, mitä valitaan ja annetaan tulosteena vastustajan valinta. Main-luokan kanssa samassa paukkauksessa on myös luokka, jolla valitaan vastustaja-algoritmi. Lisäksi on pakkaus vastustaja-algoritmeille.

## Saavutetut aika- ja tilavaativuudet
VastustajaTutkija-algoritmissa kaikkea pidetään tallessa ennalta määritellyissä muuttujissa ja yhdessä taulukossa, jonka koko on ennalta määritelty, joten tilavaativuus pysyy vakiona. Aikavaativuus on kierrosta kohden vakio (olettaen, että lukujen suuruuksien vertailut toimivat yhtä nopeasti riippumatta arvojen suuruudesta). Kierrosten määrä on tässä tosin rajattu int-muuttujan kokorajoitusten takia, mutta pahimmassakin tapauksessa algoritmia vastaan voi pelata yli kaksi miljardia kierrosta ilman, että ohjelma kaatuu.

VastustajanEdellinenValinta ja VastustajanEdellinenValintaVastastrategia vievät vakiomäärän tilaa, sillä nämä pitävät aina vain yhtä tietoa kerrallaan tallessa. Molemmat vievät myös kierrosta kohden vakioaikaa. Toisin kuin VastustajaTutkijassa, näissä kierrosten määrä ei ole rajattu, sillä muuttujien arvot eivät kasva kierrosten määrän kasvaessa.
