package racingcar.validator;

import java.util.List;

public class InputValidator {
    public void validCarName(List<String> names) {
        boolean isNonName = names.stream().noneMatch(name -> name.equals(""));
        boolean isOverLapName = names.stream().distinct().count() == names.size();

        if(!isNonName || !isOverLapName)
            throw new IllegalArgumentException();
    }

    public void validRacingCount(String s) {
        try {
            int number = Integer.parseInt(s);
            if(number <= 0)
                throw new IllegalArgumentException();
        }
        catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
