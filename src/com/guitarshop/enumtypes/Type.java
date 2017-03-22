package com.guitarshop.enumtypes;

/**
 * Created by Mara on 17.2.2017.
 */
public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString(){
        switch (this){
            case ACOUSTIC: return "Acoustic";
            case ELECTRIC: return "Electric";
            default: return super.toString();
        }
    }
}
