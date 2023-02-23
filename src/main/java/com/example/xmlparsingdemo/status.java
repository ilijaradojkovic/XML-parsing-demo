package com.example.xmlparsingdemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class status {
    public int code;
    public String severity;
    public Object details;
}
