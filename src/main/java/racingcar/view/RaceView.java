package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.PositiveBigInteger;
import racingcar.parser.Parser;

import java.util.List;

public class RaceView extends AbstractView<String> {

    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUND_COUNT_MESSAGE = "시도할 횟수는 몇 회인가요?";
    private static final String OUTPUT_WINNER_MESSAGE = "최종 우승자 : ";

    public RaceView(Parser<String> parser) {
        super(parser);
    }

    public List<String> inputCarNames() {
        return inputString(INPUT_CAR_NAME_MESSAGE);
    }

    public PositiveBigInteger inputPositiveBigInteger() {
        System.out.println(INPUT_ROUND_COUNT_MESSAGE);
        return PositiveBigInteger.of(Console.readLine());
    }

    public void outputWinners(List<String> winners) {
        outputResult(OUTPUT_WINNER_MESSAGE, winners);
    }
}
