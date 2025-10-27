package racingcar.parser;

import java.util.ArrayList;
import java.util.List;

public abstract class Parser<T> {

    public List<String> parseToList(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }

        String delimiter = getDelimiter();

        String[] segments = input.split(delimiter);
        List<String> result = new ArrayList<>();
        for (String segment : segments) {
            result.add(segment.trim());
        }

        return result;
    }

    public abstract String parseToOutputTemplate(T result);

    protected abstract String getDelimiter();
}
