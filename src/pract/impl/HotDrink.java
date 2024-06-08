package pract.impl;
import pract.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    private float volume;
    private int temperature;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.volume = 0;
        this.temperature = 0;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, float volume, int temperature) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +  '\'' + "volume=" + volume +
                ", temperature=" + temperature + '}';
    }

}
