package OOPSem.src;

import java.util.ArrayList;
import java.util.List;

public class Race {
    public int road;

    private List<Car2> list = new ArrayList<>();

    public void addRace(Car2 car) {
        list.add(car);
    }

    public void go() {
        if(road == 0){
            System.out.println("Мы ни куда не поедем");
        }else {
            int t1 = 0;
            String t2 = null;
            for (Car2 v : list) {
                if (v.getSpeed() >= t1) {
                    if (t2 != null) {
                        t1 = v.getSpeed();
                        System.out.println(v.getModel() + " Обходит " + t2);
                        t2 = v.getModel();
                        System.out.println(t2 + " " + "Выходит вперед ");
                    }else {
                        t1 = v.getSpeed();
                        t2 = v.getModel();
                        System.out.println(t2 + " " + "Выходит вперед ");
                    }

                } else {
                    System.out.println(t2 + " " + " Обходит" + " " + v.getModel());
                }

            }
            System.out.println("И Становиться победителем " + t2);
        }

    }

    public void setRoad(int road) {
        this.road = road;
    }

    public List<Car2> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "В заезде учавствуют - " + list;
    }
}


