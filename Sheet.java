package com.dndcharacters.s1project;

import java.io.Serializable;

public class Sheet implements Serializable {
    private Sheet1Fields s1;
    private Sheet2Fields s2;
    private Sheet3Fields s3;

    public Sheet() {
        s1 = new Sheet1Fields();
        s2 = new Sheet2Fields();
        s3 = new Sheet3Fields();
    }
}