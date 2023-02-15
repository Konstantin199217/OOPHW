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


    Car(String model, int year, double price, String color, int power) {
        Random random = new Random();
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
        this.speed = random.nextInt(5, 101);

    }

    void getInfo() {
        System.out.println(model + " " + year + " " + price + " " + color + " " + power);
    }
    public void powerCare(){
        this.status = true;
        System.out.println("Автомобиль заведен");
    }

    public void stopCare(){
        this.status = false;
        System.out.println("Автомобиль заглушен");
    }

    public void road(String adress){
        if (status == false){
            System.out.println("Мы не можем ехать");
        }else {
            System.out.println("Мы едем "+ adress);
        }
    }


    public void compare(Car car){
        if(this.power > car.power){
            System.out.println(this.model + " мощнее");
        }else {
            System.out.println(car.model + " мощнее");
        }
    }


}
