package com.tests;

import com.guitarshop.Instrument;
import com.guitarshop.InstrumentSpec;
import com.guitarshop.Inventory;
import com.guitarshop.enumtypes.Builder;
import com.guitarshop.enumtypes.InstrumentType;
import com.guitarshop.enumtypes.Type;
import com.guitarshop.enumtypes.Wood;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mara on 17.2.2017.
 */
public class Test {
    //@Test
        private static void initializeInventory(Inventory inventory){
            // Guitar 1
            Map properties = new HashMap();
            properties.put("instrumentType", InstrumentType.GUITAR); // To by melo byt enum ty klice
            properties.put("builder", Builder.GIBSON);
            properties.put("model", "Les Paul 6");
            properties.put("type", Type.ACOUSTIC);
            properties.put("numStrings", 6);
            properties.put("topWood", Wood.MAPLE);
            properties.put("backWood", Wood.MAPLE);
            inventory.addInstrument("#70108276",2295.95,new InstrumentSpec(properties));

            // Guitar 2
            properties.put("instrumentType", InstrumentType.GUITAR); // To by melo byt enum ty klice
            properties.put("builder", Builder.COLLINGS);
            properties.put("model", "CJ");
            properties.put("type", Type.ACOUSTIC);
            properties.put("numStrings", 6);
            properties.put("topWood", Wood.INDIAN_ROSEWOOD);
            properties.put("backWood", Wood.SITKA);
            inventory.addInstrument("#11277",3999.95,new InstrumentSpec(properties));

            // Mandolin
            properties.put("instrumentType", InstrumentType.MANDOLIN); // To by melo byt enum ty klice
            properties.put("builder", Builder.GIBSON);
            properties.put("model", "F5-G");
            properties.put("type", Type.ACOUSTIC);
            //properties.put("numStrings", 6);
            properties.put("topWood", Wood.MAPLE);
            properties.put("backWood", Wood.MAPLE);
            inventory.addInstrument("#9019920",5495.95,new InstrumentSpec(properties));

            // Banjo
            properties.put("instrumentType", InstrumentType.BANJO); // To by melo byt enum ty klice
            properties.put("builder", Builder.GIBSON);
            properties.put("model", "RB-3");
            properties.put("type", Type.ACOUSTIC);
            properties.put("numStrings", 5);
            //properties.put("topWood", Wood.MAPLE);
            properties.put("backWood", Wood.MAPLE);
            inventory.addInstrument("#8900231",2945.95,new InstrumentSpec(properties));



        }
        public static void main(String[] args) {
            Inventory inventory = new Inventory();
            initializeInventory(inventory);
            // Vyplnuje klient
            Map properties = new HashMap();
            properties.put("builder", Builder.GIBSON); // To by melo byt enum ty klice
            properties.put("backWood", Wood.MAPLE);
            InstrumentSpec clientSpec = new InstrumentSpec(properties);


            List matchingInstruments = inventory.search(clientSpec);


            if(!matchingInstruments.isEmpty()) {
                System.out.println("You might like these guitars...: ");
                for (Object instrument : matchingInstruments) {
                    if (instrument instanceof Instrument) {
                        InstrumentSpec instrumentSpec = ((Instrument) instrument).getSpec();
                        System.out.println("We have a " + instrumentSpec.getProperty("instrumentType")
                                +  instrumentSpec.getProperty("builder") + " "
                            + instrumentSpec.getProperty("model") + " you can have it only for:  "
                            + ((Instrument) instrument).getPrice() + " $! ----");
                    }

                }
            }else{
                System.out.println("..Sorry no such instrument we have...");
            }
        }
}
