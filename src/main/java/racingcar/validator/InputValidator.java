package racingcar.validator;

import java.util.List;

public class InputValidator {
    private final static int maxNameCount = 5;
    public void validCarName(List<String> names) {
        boolean isNonName = names.stream().noneMatch(name -> name.equals(""));
        boolean isOverLapName = names.stream().distinct().count() == names.size();
        boolean isLessFive = names.stream().allMatch(name -> name.length() <= maxNameCount);
        if(!isNonName || !isOverLapName || !isLessFive)
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
