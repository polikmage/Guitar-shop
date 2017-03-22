package com.guitarshop.enumtypes;

/**
 * Created by Mara on 17.2.2017.
 */
public enum Wood {
    CEDAR,ADIRONDACK,ALDER;

    @Override
    public String toString() {
        switch (this){
            case ADIRONDACK: return "Adirondack";
            case ALDER: return  "Alder";
            case CEDAR: return  "Cedar";
            default: return super.toString();
        }

    }
}
