package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.parser.Parser;
import racingcar.parser.PositiveBigInteger;
import racingcar.parser.RaceParser;
import racingcar.simulator.RaceSimulator;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.*;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 기능_테스트() {
        assertRandomNumberInRangeTest(
            () -> {
                run("pobi,woni", "1");
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 경주_진행_및_우승자_테스트() {
        // given
        List<String> carNames = Arrays.asList("car1", "car2", "car3");
        BigInteger count = BigInteger.valueOf(5);

        // when
        RaceSimulator simulator = new RaceSimulator(carNames, count);
        List<String> winners = simulator.race();

        // then
        Assertions.assertFalse(winners.isEmpty());
    }

    @Test
    void 입력값_공백_테스트() {
        // given
        String input = " car1 , car2  , car3  ";

        // when
        Parser<List<String>> parser = new RaceParser();
        List<String> carNames = parser.parseToList(input);

        // then
        Assertions.assertEquals(3, carNames.size());
    }

    @Test
    void 자동차_이름_겹침_테스트() {
        // given
        String input = "car1,car1,car3";
        Parser<List<String>> parser = new RaceParser();

        // when, then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            parser.parseToList(input);
        });
    }

    @Test
    void 양의정수_입력_테스트() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            PositiveBigInteger.of("0");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            PositiveBigInteger.of("-10");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            PositiveBigInteger.of("asd");
        });

        BigInteger bigInteger = PositiveBigInteger.of("10").getValue();
        Assertions.assertEquals(bigInteger, BigInteger.valueOf(10));
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
