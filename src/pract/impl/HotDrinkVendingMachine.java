package pract.impl;

import pract.Product;
import pract.VendingMachine;

import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {
    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }

    public HotDrinkVendingMachine() {
    }

    public Product getProduct(String name, float volume, int temperature) {
        List<Product> products = getProducts();
        for (Product product : products) {
            HotDrink product1 = (HotDrink) product;
            if (product1.getName().equals(name) &&
                    product1.getVolume() == volume &&
                    product1.getTemperature() == temperature) {
                Product result = product;
                products.remove(product);
                return result;
            }
            /*  не понимаю, почему не срабатывают методы  getVolume() и getTemperature()*/
        }
        System.out.println("No such product: " + name);
        return null;
    }
}
