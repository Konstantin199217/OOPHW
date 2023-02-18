package OOPSem.src;

public class HwOop1 {
    //    public static void main(String[] args) {
//        Car2 car1 = new Car2("Волга", 1975, 200.0, "Синяя", 2);
//        Car2 car2 = new Car2("Нива", 1975, 200.0, "Белая", 4);
//        Car2 car3 = new Car2("Жигули", 1975, 200.0, "Красный", 2);
//        Car2 car4 = new Car2("УАЗ", 1975, 200.0, "Зеленый", 4);
//
//        Race race = new Race();
//        race.setRoad(1000);
//        race.addRace(car1);
//        race.addRace(car2);
//        race.addRace(car3);
//        race.addRace(car4);
//
//        System.out.println(race.toString());
//
//        race.go();
//
//    }
    public static void main(String[] args) throws Exception {
        Book book = new Book("Крадущийся в тенях", "Пехов Алексей");
        Book book1 = new Book("Вонг озеро", "Вагнер Яна");
        Book book2 = new Book("Врата судьбы", "Кристи Агата");

        Closet cl = new Closet();
        cl.addBook(book);
        cl.addBook(book1);
        cl.addBook(book2);

        cl.remove(book2);

        System.out.println(cl);
        System.out.println("Колличество книг: " + cl.quantity());;

        try {
//            System.out.println(cl.getBook("Вонг озеро"));
            System.out.println(cl.getBook("Вонг "));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//    static void race(Car car, Car car1, int distance) {
//        int t1 = distance / car.speed;
//        int t2 = distance / car1.speed;
//
//        if (t1 > t2) {
//            System.out.println(car.model + " Развивает немыслимую скорость");
//            System.out.println(car.model+ " Обходит оппонентов одного за другим");
//            System.out.println(car.model + " " + car.color + " " + "WINNER");
//        } else {
//            System.out.println(car1.model + " Развивает немыслимую скорость");
//            System.out.println(car1.model+ "Обходит оппонентов одного за другим");
//            System.out.println(car1.model + " " + car1.color + " " + "WINNER");
//        }
//
//    }

