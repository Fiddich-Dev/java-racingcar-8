package racingcar;

import racingcar.view.RaceView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RaceController {

    private final RaceView raceView;
    private final RaceSimulator raceSimulator;

    public RaceController(RaceView raceView, RaceSimulator raceSimulator) {
        this.raceView = raceView;
        this.raceSimulator = raceSimulator;
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

        List<String> winners = raceSimulator.simulate();

        // 정답 출력
        raceView.outputWinners(winners);
    }
}
