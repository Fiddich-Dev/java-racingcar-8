package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.parser.Parser;

import java.util.List;

public abstract class AbstractView<T> {

    protected final Parser<T> parser;

    protected AbstractView(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> inputString(String message) {
        System.out.println(message);
        String input = Console.readLine();
        return parser.parseInput(input);
    }

    public void outputResult(String message, List<T> result) {
        System.out.print(message);
        System.out.println(parser.formatOutput(result));
    }
}
