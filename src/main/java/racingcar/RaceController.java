package racingcar;

import racingcar.view.RaceView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RaceController {

    private final RaceView raceView;

    public RaceController(RaceView raceView) {
        this.raceView = raceView;
    }

    public void run() {
        // 입력 받기
        List<String> carNames = raceView.inputCarNames();
        BigInteger count = raceView.inputPositiveBigInteger();

        // 차 객체 생성
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }


        RaceSimulator raceSimulator = new RaceSimulator(cars, count);

        List<String> winners = raceSimulator.simulate();

        // 정답 출력
        raceView.outputWinners(winners);
    }
}
