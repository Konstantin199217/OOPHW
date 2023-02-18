package OOPSem.src;

import java.util.Random;

public class Car2 {
    private String model;
    private int year;
    private double price;
    private String color;
    private int power;
    private int speed;


    public Car2(String model, int year, double price, String color, int power) {
        Random random = new Random();
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
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

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return model + '\'' +
                " " + year + '\'' +
                " " + price + '\'' +
                " " + color + '\'' +
                " " + power + '\'' +
                " " + speed
                ;
    }
}


