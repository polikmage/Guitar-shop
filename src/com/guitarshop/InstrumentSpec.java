package com.guitarshop;

import com.guitarshop.enumtypes.Builder;
import com.guitarshop.enumtypes.Type;
import com.guitarshop.enumtypes.Wood;

/**
 * Created by mapo0104 on 22.3.2017.
 */
public class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood topWood;
    private Wood backWoood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood topWood, Wood backWoood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWoood = backWoood;
    }

    public boolean matches(InstrumentSpec otherSpec){
    if(builder!=otherSpec.getBuilder()){
        return false;
    }
    if((model!= null)&&(model.equals(""))&&(model.equalsIgnoreCase(otherSpec.getModel()))){
        return false;
    }
    if(type != otherSpec.getType()){
        return false;
    }
    if(backWoood != otherSpec.getBackWoood()){
        return false;
    }
    if(topWood!=otherSpec.getTopWood()){
        return false;
    }
    return true;
    }


    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public Wood getBackWoood() {
        return backWoood;
    }

    public void setBackWoood(Wood backWoood) {
        this.backWoood = backWoood;
    }
}
