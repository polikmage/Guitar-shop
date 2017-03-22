package com.guitarshop;

import com.guitarshop.enumtypes.Builder;
import com.guitarshop.enumtypes.Type;
import com.guitarshop.enumtypes.Wood;

/**
 * Created by Mara on 17.2.2017.
 */
public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood topWood, Wood backWood, int numStrings) {
        super(builder, model, type, topWood, backWood);
        this.numStrings=numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec)){
            return false;
        }
        if (!(otherSpec instanceof GuitarSpec)){
            return false;
        }
        GuitarSpec spec = (GuitarSpec) otherSpec;
        if(numStrings != spec.getNumStrings()){
            return false;
        }
        return true;
    }
}
