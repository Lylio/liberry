package com.lylechristine.liberry.stringpadder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringPadderImplTest {

    private final StringPadderImpl stringPadder = new StringPadderImpl();

    @Test
    void PadLeft() {
        assertThat(stringPadder.padLeft("liberrieswithcream", 25)) //18
                .isEqualTo("       liberrieswithcream");
    }

    @Test
    void PadLeftWithZeros() {
        assertThat(stringPadder.padLeft("liberrieswithcream", 30, '0'))
                .isEqualTo("000000000000liberrieswithcream");

    }

    @Test
    void PadRight() {
        assertThat(stringPadder.padRight("liberrieswithcream", 25))
                .isEqualTo("liberrieswithcream       ");
    }

    @Test
    void PadRightWithSevens() {
        assertThat(stringPadder.padRight("liberrieswithcream", 28, '7'))
                .isEqualTo("liberrieswithcream7777777777");
    }

    @Test
    void padLeftWithInvalidTotalLength() {
        assertThat(stringPadder.padLeft("liberrieswithcream", 5))
                .isEqualTo("liberrieswithcream");
    }

    @Test
    void padLeftWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padLeft("liberrieswithcream", 3, '0'))
                .isEqualTo("liberrieswithcream");
    }

    @Test
    void padRightInvalidTotalLength() {
        assertThat(stringPadder.padRight("liberrieswithcream", 3))
                .isEqualTo("liberrieswithcream");
    }

    @Test
    void padRightWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padRight("liberrieswithcream", 3, '0'))
                .isEqualTo("liberrieswithcream");
    }
}
