package com.guitarshop;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mara on 17.2.2017.
 */
public class Inventory {
    private List<Instrument> inventory;

    public Inventory() {
        inventory = new LinkedList<>();
    }
    public  void addInstrument(String serialNumber, Double price, InstrumentSpec spec){
       Instrument instrument = null;
        if(spec instanceof GuitarSpec){
           instrument = new Guitar(serialNumber,price,(GuitarSpec) spec);
        } else if (spec instanceof MandolineSpec){
            instrument = new Mandoline(serialNumber,price,(MandolineSpec)spec);
        }
        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for(Instrument instrument : inventory){

            if(instrument.getSerialNumber().equals(serialNumber)){
            return instrument;
            }
        }
        return null;
    }
    public List search(InstrumentSpec searchSpec){ //Instrument spec dat do vstupu a podle toho co to je za instrument vybrat navrat
        List matchingInstruments = new LinkedList();
        for (Instrument instrument : inventory){
                if(instrument.getSpec().matches(searchSpec)){
                    matchingInstruments.add(instrument);
                }
            }
        return matchingInstruments;
        }

}


