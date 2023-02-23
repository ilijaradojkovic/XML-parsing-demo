package com.example.xmlparsingdemo.model;

import com.example.xmlparsingdemo.model.Predmet;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@XmlRootElement(name = "predmeti")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PolozeniPredemeti {

    @XmlElement(name = "predmet")
    public List<Predmet> predmetList;
}
