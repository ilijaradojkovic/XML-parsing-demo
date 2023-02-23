package com.example.xmlparsingdemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class stmttrn {
    public String trntype;
    public String fitid;
    public Object trnuid;
    public String benefit;
    public payeeinfo payeeinfo;
    public payeeaccountinfo payeeaccountinfo;
    public Date dtposted;
    public double trnamt;
    public String purpose;
    public int purposecode;
    public String curdef;
    public String payeerefnumber;
    public String trnplace;
    public Date dtuser;
    public Date dtavail;
    public String refnumber;
    public Object refmodel;
    public Object payeerefmodel;
    public String urgency;
    public Object fee;
    public statusinfo statusinfo;
}

