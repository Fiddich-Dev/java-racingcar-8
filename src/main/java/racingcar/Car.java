package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.math.BigInteger;

public class Car {
    private final String name;
    private BigInteger distance;

    public Car(String name) {
        this.name = name;
        distance = BigInteger.ZERO;
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
