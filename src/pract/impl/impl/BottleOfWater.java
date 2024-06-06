package pract.impl.impl;
import pract.Main;
import pract.Product;

import java.time.LocalDate;
public class BottleOfWater extends Product {

    private float volume;
    private String  pack;
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 0;
        this.pack = Main.Packege.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean isSpark, String  pack, float volume) {
        super(name, price, releaseDate);
        this.isSpark = isSpark;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String  getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "pract.impl.BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}