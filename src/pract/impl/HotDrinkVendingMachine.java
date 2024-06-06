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
            if (product.getName().equals(name) &&
                    product.getVolume().equals(volume) &&
                    product.getTemperature().equals(temperature)) {
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
