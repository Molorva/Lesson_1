package pract.impl;

public enum Packege {
    PLASTIC("пластик"), GLASS("стекло"), POLYETILEN("Полиэтилен");

    private final String material;

    Packege(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
