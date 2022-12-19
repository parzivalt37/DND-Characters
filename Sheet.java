package com.dndcharacters.s1project;

import java.io.Serializable;

/**Has Sheet1Fields and Sheet2Fields data classes as state variables: combines into one object that will be serialized/deserialized
 * @author S. Mahon
 * @version 12.15.2022
 */
public class Sheet implements Serializable {
    public Sheet1Fields s1;
    public Sheet2Fields s2;

    public Sheet() {
        s1 = new Sheet1Fields();
        s2 = new Sheet2Fields();
    }
}