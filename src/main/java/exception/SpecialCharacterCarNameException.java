package exception;

public class SpecialCharacterCarNameException extends RuntimeException {
    private static final String SPECIAL_CHARACTER_CAR_NAME_EXCEPTION = "[ERROR] 자동차 이름에는 특수문자가 들어갈 수 없습니다.";

    public SpecialCharacterCarNameException(final String name, final String invalidCharacter) {
        super(SPECIAL_CHARACTER_CAR_NAME_EXCEPTION
                + "invalid name: " + name
                + "\ninvalid character: " + invalidCharacter);
    }
}
