package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Flavor extends Ingredient {


    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }


// overide method to print name
    @Override
    public String toString() {
        return  super.getName()+"\n";
    }

}
