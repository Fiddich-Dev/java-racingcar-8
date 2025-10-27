package racingcar.parser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RaceParser extends Parser<List<String>> {

    private static final String INPUT_DELIMITER = ",";
    private static final String OUTPUT_DELIMITER = ", ";

    @Override
    public List<String> parseToList(String input) {
        List<String> carNames = super.parseToList(input);
        if(carNames.size() != new HashSet<>(carNames).size()) {
            throw new IllegalArgumentException("자동차 이름이 겹치면 안됩니다.");
        }
        return carNames;
    }

    @Override
    public String parseToOutputTemplate(List<String> result) {
        return String.join(OUTPUT_DELIMITER, result);
    }

    @Override
    protected String getDelimiter() {
        return INPUT_DELIMITER;
    }
}
