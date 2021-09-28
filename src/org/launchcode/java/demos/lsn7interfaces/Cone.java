package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Cone extends Ingredient {

    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }
// Use this method if we want to return double value in toString method . String.valueOf will covert to string value
//    @Override
//    public String toString() {
//        return String.valueOf(super.getCost());
//    }

 //** Use this method since we are concatinating  string and double
    @Override
    public String toString() {
        return "\n"+super.getName()+" :"+super.getCost();
    }


}
