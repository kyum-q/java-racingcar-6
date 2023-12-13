package racingcar.view;

import racingcar.constant.PrintMessage;
import racingcar.model.Cars;

public class OutputView {
    public void printRacingResultInfo() {
        System.out.println();
        System.out.println(PrintMessage.PRINT_RACING_RESULT_INFO.getMessage());
    }
    public void printRacingResult(Cars cars) {
        System.out.println(cars.toString());
    }
}
