package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {
    private InputView inputView;
    private OutputView outputView;
    private Cars cars;
    public GameController() {
        inputView = new InputView();
        outputView = new OutputView();
    }
    public void startGame() {
        carSetting();
        PlayGame();
    }
    private void carSetting() {
        List<String> names = inputView.requestName();
        cars = new Cars(names);
    }

    private void PlayGame() {
        int racingCount = inputView.requestRacingCount();
        outputView.printRacingResultInfo();

        for (int i = 0; i < racingCount; i++) {
            cars.racing();
            outputView.printRacingResult(cars);
        }

       outputView.printFinalResult(cars);
    }
}
