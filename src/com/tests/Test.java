package com.tests;

import com.guitarshop.*;
import com.guitarshop.enumtypes.Builder;
import com.guitarshop.enumtypes.Style;
import com.guitarshop.enumtypes.Type;
import com.guitarshop.enumtypes.Wood;

import java.util.List;

/**
 * Created by Mara on 17.2.2017.
 */
public class Test {
    //@Test
        private static void initializeInventory(Inventory inventory){
        inventory.addInstrument("X123",123.3,new GuitarSpec(Builder.FENDER,"Stratocastor", Type.ACOUSTIC, Wood.ALDER,Wood.ALDER,12));
        inventory.addInstrument("A13",183.3,new GuitarSpec(Builder.GIBSON,"Lunatic", Type.ELECTRIC, Wood.ADIRONDACK,Wood.ALDER,9));
        inventory.addInstrument("X103",193.3,new GuitarSpec(Builder.FENDER,"Stratocastor", Type.ACOUSTIC, Wood.ALDER,Wood.CEDAR,6));
        inventory.addInstrument("H553",223.3,new GuitarSpec(Builder.FENDER,"Stratocastor", Type.ACOUSTIC, Wood.ALDER,Wood.ALDER,12));
        inventory.addInstrument("vv123",123.3,new MandolineSpec(Builder.FENDER,"Stratocastor", Type.ACOUSTIC, Wood.ALDER,Wood.ALDER,Style.A));
        inventory.addInstrument("rr33",183.3,new MandolineSpec(Builder.GIBSON,"Lunatic", Type.ELECTRIC, Wood.ADIRONDACK,Wood.ALDER,Style.F));

        }
        public static void main(String[] args) {
            Inventory inventory = new Inventory();
            initializeInventory(inventory);
            GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,"Stratocastor", Type.ACOUSTIC, Wood.ALDER,Wood.ALDER,12);
            MandolineSpec whatMaraLikes = new MandolineSpec(Builder.FENDER,"Stratocastor", Type.ACOUSTIC, Wood.ALDER,Wood.ALDER, Style.A);

            List matchingGuitars = inventory.search(whatErinLikes);
            List matchingMandolines = inventory.search(whatMaraLikes);

            if(!matchingGuitars.isEmpty()) {
                System.out.println("You might like these guitars...: ");
                for (Object instrument : matchingGuitars){
                    Guitar guitar = (Guitar) instrument;
                    GuitarSpec gSpec = (GuitarSpec) guitar.getSpec();
                    System.out.println("We have a " +
                    gSpec.getBuilder() + " "
                            + gSpec.getModel() + " you can have it only for:  "
                            + guitar.getPrice() + " $! ----" );

                }
            }else{
                System.out.println("..Sorry no such guitar we have...");
            }

            if(!matchingMandolines.isEmpty()) {
                System.out.println("You might like these Mandolines...: ");
                for (Object instrument : matchingMandolines){
                    Mandoline mandoline = (Mandoline) instrument;
                    MandolineSpec mSpec = (MandolineSpec) mandoline.getSpec();
                    System.out.println("We have a " +
                            mSpec.getBuilder() + " "
                            + mSpec.getModel() + " you can have it only for:  "
                            + mandoline.getPrice() + " $! ----" );

                }
            }else{
                System.out.println("..Sorry no such mandoline we have...");
            }

        }
}
