package racingcar.parser;

import java.util.Arrays;
import java.util.List;

public class RaceParser implements Parser<String> {

    private static final String INPUT_DELIMITER = ",";
    private static final String OUTPUT_DELIMITER = ", ";

    @Override
    public List<String> parseInput(String input) {
        if(input == null || input.isBlank()) {
            throw new IllegalArgumentException("자동차 이름을 입력해야 합니다.");
        }

        String noSpaces = input.replaceAll("\\s", "");
        return Arrays.asList(noSpaces.split(INPUT_DELIMITER));
    }

    @Override
    public String formatOutput(List<String> result) {
        return String.join(OUTPUT_DELIMITER, result);
    }
}
