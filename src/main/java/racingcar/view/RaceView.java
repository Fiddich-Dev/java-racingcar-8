package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.parser.PositiveBigInteger;
import racingcar.parser.Parser;

import java.math.BigInteger;
import java.util.List;

public class RaceView {

    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUND_COUNT_MESSAGE = "시도할 횟수는 몇 회인가요?";
    private static final String OUTPUT_WINNER_MESSAGE = "최종 우승자 : ";

    private final Parser<List<String>> parser;

    public RaceView(Parser<List<String>> parser) {
        this.parser = parser;
    }

    public List<String> inputCarNames() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);
        return parser.parseToList(Console.readLine());
    }

    public BigInteger inputPositiveBigInteger() {
        System.out.println(INPUT_ROUND_COUNT_MESSAGE);
        return PositiveBigInteger.of(Console.readLine()).getValue();
    }

    public void closeScanner() {
        Console.close();
    }

    public void printWinners(List<String> winners) {
        System.out.print(OUTPUT_WINNER_MESSAGE);
        System.out.println(parser.parseToOutputTemplate(winners));
    }
}
