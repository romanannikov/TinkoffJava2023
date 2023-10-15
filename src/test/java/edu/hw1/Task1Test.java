package edu.hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {
    @Test
    @DisplayName("00:00")
    void Test0() {
        String timeinmins = "00:00";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(0);
    }
    @Test
    @DisplayName("00:01")
    void Test_1() {
        String timeinmins = "00:01";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(1);
    }
    @Test
    @DisplayName("00:10")
    void Test_10() {
        String timeinmins = "00:10";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(10);
    }
    @Test
    @DisplayName("00:11")
    void Test_11() {
        String timeinmins = "00:11";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(11);
    }
    @Test
    @DisplayName("01:00")
    void Test_1_00() {
        String timeinmins = "01:00";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(60);
    }
    @Test
    @DisplayName("100:59")
    void Test_100_59() {
        String timeinmins = "100:59";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(6059);
    }
    @Test
    @DisplayName("00:66")
    void Test_wrongsecs() {
        String timeinmins = "00:66";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(-1);
    }
    @Test
    @DisplayName("0:066")
    void Test_wrongsplit() {
        String timeinmins = "0:066";

        int timeinsecs = Task1.Mins_to_secs(timeinmins);

        assertThat(timeinsecs)
            .isEqualTo(-1);
    }
}
