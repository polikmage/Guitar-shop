package com.guitarshop;

import com.guitarshop.enumtypes.Builder;
import com.guitarshop.enumtypes.Style;
import com.guitarshop.enumtypes.Type;
import com.guitarshop.enumtypes.Wood;

/**
 * Created by mapo0104 on 22.3.2017.
 */
public class MandolineSpec extends InstrumentSpec {
    private Style style;
    public MandolineSpec(Builder builder, String model, Type type, Wood topWood, Wood backWoood,Style style) {
        super(builder, model, type, topWood, backWoood);
        this.style=style;
    }

    public Style getStyle() {
        return style;
    }

    @SuppressWarnings("Duplicates")
    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec)){
            return false;
        }
        if (!(otherSpec instanceof MandolineSpec)){
            return false;
        }
        MandolineSpec spec = (MandolineSpec) otherSpec;
        if(style != spec.getStyle()){
            return false;
        }
        return true;
    }
}
