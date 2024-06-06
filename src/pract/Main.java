package pract;

import pract.impl.*;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product bottle1  = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5,1));
        Product bottle2 =  new BottleOfWater("Родники", 55, LocalDate.of(2024, 5,1),
                true, Packege.GLASS.getMaterial(), 0.5F);

        Product hotDrink1 = new HotDrink("Кофе", 100, LocalDate.now(),0.3F, 100);
        Product hotDrink2 = new HotDrink("Кофе со сливками", 150, LocalDate.now(),0.3F, 100);
        VendingMachine vm = new HotDrinkVendingMachine();
        System.out.println(vm.getProducts());
        vm.addProducts(List.of(hotDrink1,hotDrink2,hotDrink1,hotDrink1,hotDrink2));
        System.out.println(vm.getProducts());

    }

}