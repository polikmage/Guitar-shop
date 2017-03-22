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
    public List search(GuitarSpec searchSpec){ //Instrument spec dat do vstupu a podle toho co to je za instrument vybrat navrat
        List matchingGuitars = new LinkedList();
        for (Instrument instrument : inventory){
            if(instrument instanceof Guitar){
                Guitar guitar = (Guitar) instrument;
                if(guitar.getSpec().matches(searchSpec)){
                    matchingGuitars.add(guitar);
                }
            }
        }
        return matchingGuitars;
    }
    public List search(MandolineSpec searchSpec){
        List matchingMandolines = new LinkedList();
        for (Instrument instrument : inventory){
            if(instrument instanceof Mandoline) {
                Mandoline mandoline = (Mandoline) instrument;
                if (mandoline.getSpec().matches(searchSpec)) {
                    matchingMandolines.add(mandoline);
                }
            }
        }
        return matchingMandolines;
    }
}
