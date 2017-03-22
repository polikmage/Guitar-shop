package com.guitarshop.enumtypes;

/**
 * Created by Mara on 17.2.2017.
 */
public enum Builder {
    FENDER,MARTIN,GIBSON;

    @Override
    public String toString() {
        switch (this){
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case MARTIN: return "Martin";
            default: return super.toString();
        }

    }
}
