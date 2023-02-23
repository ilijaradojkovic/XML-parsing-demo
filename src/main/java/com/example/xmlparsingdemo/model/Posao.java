package com.example.xmlparsingdemo.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@XmlRootElement(name = "posao")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Posao {

    @XmlElement(name="naziv")
    public String naziv;
}
