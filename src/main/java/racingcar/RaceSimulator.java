package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.view.RaceView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceSimulator {

    private final RaceView raceView;
    private final List<String> carNames;
    private final BigInteger count;
    private final List<Car> cars = new ArrayList<>();

    public RaceSimulator(RaceView raceView) {
        this.raceView = raceView;
        this.carNames = raceView.inputCarNames();
        for(String carName : carNames) {
            cars.add(new Car(carName));
        }
        this.count = raceView.inputPositiveBigInteger().getValue();
        Console.close();
    }

    public void simulate() {
        System.out.println("실행 결과");
        for(BigInteger i = BigInteger.ZERO; i.compareTo(count) < 0; i = i.add(BigInteger.ONE)) {
            tryMove();
            System.out.println();
        }
    }

    public void tryMove() {
        for(Car car : cars) {
            car.tryMove();
            print(car);
        }
    }

    public void print(Car car) {
        System.out.println(car.getName() + " : " + convert(car.getDistance()));
    }

    public String convert(BigInteger distance) {
        StringBuilder stringBuilder = new StringBuilder();
        BigInteger i = BigInteger.ZERO;

        while (i.compareTo(distance) < 0) {
            stringBuilder.append("-");
            i = i.add(BigInteger.ONE);
        }

        return stringBuilder.toString();
    }
}
