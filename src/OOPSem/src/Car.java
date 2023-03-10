package OOPSem.src;

import java.util.Random;

public class Car {
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status;
    int speed;


    public Car(String model, int year, double price, String color, int power) {
        Random random = new Random();
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
        this.speed = random.nextInt(5, 101);

    }

    public void getInfo() {
        System.out.println(model + " " + year + " " + price + " " + color + " " + power);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public void compare(Car car){
        if(this.power > car.power){
            System.out.println(this.model + " мощнее");
        }else {
            System.out.println(car.model + " мощнее");
        }
    }


}
