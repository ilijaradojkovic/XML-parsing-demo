package com.example.xmlparsingdemo.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    @XmlElement(name = "name")
    public String name;
    @XmlElement(name = "id")
    public String id;

    @XmlElement(name = "adresa")
    public Adresa adresa;

    //izignorisace ako varijabla postoji   u xml-u,a ne u kodu
    //ako postoj u kod a ne u xml-u bice null
    @XmlElement(name = "posao")
    public Posao posao;

    // radice ovako ako imamo xml gde imamo samo <predmet> <predemet> vise puta on ce da ih izbroji i staviti u listu,
    //ako imamo <polozeni_predmeti> <predmet><predmet> onda moramo da imamo klasu za polozeni_predemt koja ce da sadrzi listu predemeta
//    @XmlElement(name = "predmet")
//    List<Predmet> predmeti;

    @XmlElement(name = "predmeti")
    public PolozeniPredemeti polozeniPredemeti;
}
