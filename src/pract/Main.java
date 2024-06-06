package pract;

import pract.impl.impl.BottleOfWater;
import pract.impl.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bottle1  = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5,1));
        Product bottle2 =  new BottleOfWater("Родники", 55, LocalDate.of(2024, 5,1),
                true, Packege.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();
        System.out.println(vm.getProducts());
        vm.addProducts(List.of(bottle1,bottle2,bottle1,bottle2,bottle2));
        System.out.println(vm.getProducts());
        vm.getProduct("Родники");
        System.out.println(vm.getProducts());
    }

    public enum Packege {
        PLASTIC("пластик"), GLASS("стекло");

        private final String material;
        Packege(String material){
            this.material = material;
        }

        public String getMaterial() {
            return material;
        }
    }
}