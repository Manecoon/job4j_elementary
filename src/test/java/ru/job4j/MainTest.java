package ru.job4j;

<<<<<<< HEAD
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
=======
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
>>>>>>> a2f1a74 (job4j_elementary)

public class MainTest {
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
<<<<<<< HEAD
        assertThat(result).isEqualTo(excepted);
=======
        assertThat(result, is(excepted));
>>>>>>> a2f1a74 (job4j_elementary)
    }
}
