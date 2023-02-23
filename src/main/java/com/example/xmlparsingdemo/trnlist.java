package com.example.xmlparsingdemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class trnlist {
    public List<stmttrn> stmttrn;
    public int count;
    public String text;
}