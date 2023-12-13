package racingcar.validator;

import java.util.List;

public class InputValidator {
    public void validCarName(List<String> names) {
        boolean isNonName = names.stream().noneMatch(name -> name.equals(""));
        boolean isOverLapName = names.stream().distinct().count() == names.size();

        if(!isNonName || !isOverLapName)
            throw new IllegalArgumentException();
    }
}
