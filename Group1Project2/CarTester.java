package com.syntax.Group1Project2;
class CarTester{
    public static void main(String[] args) {

        Sedan sedan = new Sedan(2500,24000);
        System.out.println("The price of this sedan will be "+sedan.calculateSalePrice());

        Truck truck = new Truck(55,45000);
        System.out.println("The price of this truck will be "+truck.calculateSalePrice());

    }
}
