package racingcar.constant;

public enum RequestMessage {
    REQUEST_CARS_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    REQUEST_NUMBER_PLAY("시도할 회수는 몇회인가요?");

    private String message;
    RequestMessage(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }
}
