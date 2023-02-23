package com.example.xmlparsingdemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class stmtrs {
    public String rstype;
    public status status;
    public String curdef;
    public String acctid;
    public int stmtnumber;
    public ledgerbal ledgerbal;
    public availbal availbal;
    public double reservedfunds;
    public trnlist trnlist;
    public extension extension;
    public Object overdraftremaining;
    public Object overdraftused;
    public Object directdebitreserved;
    public double projectedavail;
}
