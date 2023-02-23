package com.example.xmlparsingdemo.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement(name = "predmet")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Predmet {

    @XmlElement(name = "naziv")
    public String naziv;

    @XmlElement(name = "ocena")
    public int ocena;
}
