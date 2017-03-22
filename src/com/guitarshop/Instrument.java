package com.guitarshop;

/**
 * Created by mapo0104 on 22.3.2017.
 */
public abstract class Instrument {
    private String serialNumber;
    private Double price;
    private InstrumentSpec spec;
    public Instrument(String serialNumber, Double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

}
