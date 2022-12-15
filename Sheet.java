package com.dndcharacters.s1project;

import java.io.Serializable;

public class Sheet implements Serializable {
    public Sheet1Fields s1;
    public Sheet2Fields s2;

    public Sheet() {
        s1 = new Sheet1Fields();
        s2 = new Sheet2Fields();
    }
}