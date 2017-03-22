package com.guitarshop.enumtypes;

/**
 * Created by mapo0104 on 22.3.2017.
 */
public enum Style {
    A,F;

    @Override
    public String toString() {
        switch (this){
            case A: return "A";
            case F: return  "F";
            default: return super.toString();
        }
    }
}
