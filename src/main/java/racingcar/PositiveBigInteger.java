package racingcar;

import java.math.BigInteger;

public class PositiveBigInteger {

    private final BigInteger value;

    public PositiveBigInteger(BigInteger value) {
        if (value.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("0 이하의 값은 허용되지 않습니다: " + value);
        }
        this.value = value;
    }

    public BigInteger getValue() {
        return value;
    }

    public static PositiveBigInteger of(BigInteger value) {
        return new PositiveBigInteger(value);
    }

    public static PositiveBigInteger of(String input) {
        try {
            BigInteger bigInteger = new BigInteger(input.trim());
            return new PositiveBigInteger(bigInteger);
        } catch (Exception e) {
            throw new IllegalArgumentException("올바른 숫자 입력이 아닙니다: " + input);
        }
    }
}
