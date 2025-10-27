package racingcar.contoller;

import racingcar.simulator.RaceSimulator;
import racingcar.view.RaceView;

import java.math.BigInteger;
import java.util.List;

public class RaceController {

    private final RaceView raceView;

    public RaceController(RaceView raceView) {
        this.raceView = raceView;
    }

    public void run() {
        // 입력 받기
        List<String> carNames;
        BigInteger count;
        try {
            carNames = raceView.inputCarNames();
            count = raceView.inputPositiveBigInteger();
        } finally {
            raceView.closeScanner();
        }

        // 시뮬레이터 생성
        RaceSimulator raceSimulator = new RaceSimulator(carNames, count);

        // 로직 실행
        List<String> winners = raceSimulator.race();

        // 정답 출력
        raceView.printWinners(winners);
    }
}
