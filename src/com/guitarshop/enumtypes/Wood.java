package com.guitarshop.enumtypes;

/**
 * Created by Mara on 17.2.2017.
 */
public enum Wood {
    CEDAR,ADIRONDACK,ALDER,MAPLE,SPRUCE,SITKA,INDIAN_ROSEWOOD;

    @Override
    public String toString() {
        switch (this){
            case ADIRONDACK: return "Adirondack";
            case ALDER: return  "Alder";
            case CEDAR: return  "Cedar";
            case MAPLE: return "Maple";
            case SPRUCE: return  "Spruce";
            case SITKA: return "Sitka";
            case INDIAN_ROSEWOOD:return "IndianRosewood";
            default: return super.toString();
        }

    }
}
