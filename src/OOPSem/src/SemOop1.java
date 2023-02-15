package OOPSem.src;

public class SemOop1 {
    public static void main(String[] args) {
        Car car2 = new Car("Ural", 1985, 300, "Green", 6);
        Car car1 = new Car("Volga", 1999, 200.0, "Black", 2);

        race(car1, car2, 1000);

        car2.compare(car1);

    }

    static void ex1() {
        /*Создать класс Fruit
         * В классе должно храниться следующая информация:
         *
         * 1 - название - name
         * 2 - цвет -color
         * 3 - вес - weight
         * 4 - стоимость - price*/

    }

    static void ex2() {
        /*Доработать класс Car.
         * В классе должна храниться следующая информация:
         * Свойство - которое говорит заведен авто или нет
         * Метод - запска автомобиля
         * Метод - остановки автомобиля
         * Метод дороги - при вызове, в качестве аргумента передает
         * место назначения. И если авто заведен - выводит,
         * что иы на таком то авто едим в место назначения
         * Если не заведен - сообщитьб что авто не заведеною.
         * И мы не можем ехать*/

        Car car = new Car("Ural", 1999, 200.0, "green", 4);
//        car.getInfo();
//        car.road("Messisipi");
//        car.powerCare();
//        car.road("Murom");
//        car.stopCare();
        Car car2 = new Car("Volga", 1985, 300, "black", 2);

    }

    static void race(Car car, Car car1, int distance) {
        int t1 = distance / car.speed;
        int t2 = distance / car1.speed;

        if (t1 > t2) {
            System.out.println(car.model + " Развивает немыслимую скорость");
            System.out.println(car.model+ " Обходит оппонентов одного за другим");
            System.out.println(car.model + " " + car.color + " " + "WINNER");
        } else {
            System.out.println(car1.model + " Развивает немыслимую скорость");
            System.out.println(car1.model+ "Обходит оппонентов одного за другим");
            System.out.println(car1.model + " " + car1.color + " " + "WINNER");
        }

    }

}
