package racingcar.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cars implements Comparator<Car> {
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
        int max = cars.stream().max(this).get().getForward();

        String result = "";
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getForward() == max)
                result += cars.get(i).getName() + ", ";
        }

        return String.copyValueOf(result.toCharArray(), 0, result.length()-2);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < cars.size(); i++) {
            result += cars.get(i).toString();
        }

        return result;
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getForward() - o2.getForward();
    }
}
