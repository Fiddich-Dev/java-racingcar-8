package racingcar;


import racingcar.contoller.RaceController;
import racingcar.parser.Parser;
import racingcar.parser.RaceParser;
import racingcar.view.RaceView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Parser<String> parser = new RaceParser();
        RaceView raceView = new RaceView(parser);

        RaceController raceController = new RaceController(raceView);
        raceController.run();
    }
}
