/**
 * Created by abdullah on 11/7/2016.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;

public class Input {
    private ImmutableList<Integer> numbers;

    protected Input(){
        numbers = ImmutableList.of();
    }

    @VisibleForTesting
    protected Input(Integer... values) {
        if (values == null) {
            values = new Integer[0];
        }
        numbers = ImmutableList.copyOf(values);
    }

    @JsonProperty("numbers")
    public ImmutableList<Integer> getNumbers() {
        return numbers;
    }

    public boolean hasNoNumbers() {
        return numbers.isEmpty();
    }
}