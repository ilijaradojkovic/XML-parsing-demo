package com.example.xmlparsingdemo;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "stmtrslist")
public class stmtrslist {
    public stmtrs stmtrs;
}