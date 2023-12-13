package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validator.InputValidator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InputView {
    private InputValidator validator;
    public InputView() {
        validator = new InputValidator();
    }

    public List<String> requestName() {
        String s = Console.readLine();
        List<String> names = Arrays.stream(s.trim().split(",", -1)).toList();
        validator.validCarName(names);

        return Collections.unmodifiableList(names);
    }
}
