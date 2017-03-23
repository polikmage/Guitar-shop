package com.guitarshop.enumtypes;

/**
 * Created by mapo0104 on 23.3.2017.
 */
public enum InstrumentType {
    BANJO,DOBRO,BASS,GUITAR,MANDOLIN,FIDDLE;

    @Override
    public String toString() {
        switch (this){
            case BANJO: return "BANJO";
            case DOBRO: return "DOBRO";
            case BASS: return "BASS";
            case GUITAR: return "GUITAR";
            case MANDOLIN: return "MANDOLIN";
            case FIDDLE: return "FIDDLE";
            default: return "Unspecified";
        }
    }
}
