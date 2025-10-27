package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.math.BigInteger;

public class Car {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;
    private BigInteger distance;

    public Car(String name) {
        validateName(name);
        this.name = name;
        distance = BigInteger.ZERO;
    }

    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름은 비어 있을 수 없습니다.");
        }

        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + MAX_NAME_LENGTH + "글자 이하만 가능합니다: " + name);
        }
    }

    public String getName() {
        return name;
    }

    public BigInteger getDistance() {
        return distance;
    }

    public void tryMove() {
        if(Randoms.pickNumberInRange(0, 9) >= 4) {
            distance = distance.add(BigInteger.ONE);
        }
    }
}
