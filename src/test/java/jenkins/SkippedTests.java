package jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("simple")
public class SkippedTests {

    @Test
    @Disabled("in developing =)")
    void test4(){
        Assertions.assertTrue(true);
    }
}
