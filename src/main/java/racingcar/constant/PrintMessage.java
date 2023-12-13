package racingcar.constant;

public enum PrintMessage {
    PRINT_RACING_RESULT_INFO("실행 결과"),
    PRINT_FINAL_RESULT_INFO("최종 우승자 : ");
    private String message;
    PrintMessage(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }
}