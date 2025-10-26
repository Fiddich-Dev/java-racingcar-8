package racingcar.parser;

import java.util.List;

public interface Parser<T> {

    List<T> parseInput(String input);

    String formatOutput(List<T> result);
}
