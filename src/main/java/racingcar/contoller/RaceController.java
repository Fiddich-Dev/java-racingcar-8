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
        List<String> carNames;
        BigInteger count;
        try {
            carNames = raceView.inputCarNames();
            count = raceView.inputPositiveBigInteger();
        } finally {
            raceView.closeScanner();
        }

        RaceSimulator raceSimulator = new RaceSimulator(carNames, count);
        List<String> winners = raceSimulator.race();

        raceView.printWinners(winners);
    }
}
