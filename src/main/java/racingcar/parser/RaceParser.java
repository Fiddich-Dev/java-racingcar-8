package racingcar.parser;

import java.util.List;

public class RaceParser extends Parser<List<String>> {

    private static final String INPUT_DELIMITER = ",";
    private static final String OUTPUT_DELIMITER = ", ";

    @Override
    public String parseToOutputTemplate(List<String> result) {
        return String.join(OUTPUT_DELIMITER, result);
    }

    @Override
    protected String getDelimiter() {
        return INPUT_DELIMITER;
    }
}
