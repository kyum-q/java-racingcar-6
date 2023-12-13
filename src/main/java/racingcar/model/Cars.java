package racingcar.model;

import java.util.List;

public class Cars {
    private List<Car> cars;
    public Cars(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            cars.add(new Car(names.get(i)));
        }
    }
}
