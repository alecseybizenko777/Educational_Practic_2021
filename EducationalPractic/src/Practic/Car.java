package Practic;

import java.io.FileWriter;
import java.io.IOException;

public class Car {

    private String brand, name;
    private int cost, rentalCost, pledgeAmount;

    Car(String brand, int cost, String name, int rentalCost, int pledgeAmount) {
        this.brand = brand;
        this.cost = cost;
        this.name = name;
        this.rentalCost = rentalCost;
        System.out.println("\nАвтомобиль:\nБрэнд - " + this.brand + ";\nСтоимость = "
                + this.cost + "$;\nНазвание: " + this.name
                + ";\nСтоимость аренды = " + this.rentalCost + ". Залог для его аренды составляет " + pledgeAmount);

        try(FileWriter writer = new FileWriter("CarList.txt", true))
        {
            writer.write("Автомобиль:\nБрэнд - " + this.brand + ";\nСтоимость = "
                    + this.cost + "$;\nНазвание: " + this.name
                    + ";\nСтоимость аренды = " + this.rentalCost + "$."
                    + ". Залог для его аренды составляет " + pledgeAmount + "\n\n");
            //writer.close();
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Автомобиль \"" + name + "\" от производителя \"" + brand + "\", цена которого составляет " + cost + "$ имеет цену проката за день = " + rentalCost + "$.";
    }

}