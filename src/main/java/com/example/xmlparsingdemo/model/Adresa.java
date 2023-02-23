package com.example.xmlparsingdemo.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "adresa")
@ToString
public class Adresa {
    @XmlElement(name = "ulica")
    public String ulica;

    @XmlElement(name = "broj")
    public int broj;

    @XmlElement(name = "drzava")
    public String drzava;

    @XmlElement(name = "grad")
    public String grad;
}
