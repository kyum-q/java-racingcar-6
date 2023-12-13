package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;
    public Cars(List<String> names) {
        cars = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            cars.add(new Car(names.get(i)));
        }
    }

    public void racing() {
        for (int i = 0; i < cars.size(); i++) {
            int num = NumberGenerator.createRandomNumber();
            if(num >= 4)
                cars.get(i).forward();
        }
    }

    public String getFinalWinner() {
        return "";
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < cars.size(); i++) {
            result += cars.get(i).toString();
        }

        return result;
    }
}
