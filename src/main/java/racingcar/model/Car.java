package racingcar.model;

public class Car {
    private String name;
    private int runForward = 0;

    public Car(String name) {
        this.name = name;
    }

    public void forward() {
        runForward++;
    }

    public int getForward() {
        return runForward;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String racingResult = "";
        for (int i = 0; i < runForward; i++) {
            racingResult += "-";
        }

        return name + " : " + racingResult + "\n";
    }
}
