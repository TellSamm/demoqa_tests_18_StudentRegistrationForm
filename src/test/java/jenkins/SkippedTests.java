package jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("simple")
public class SkippedTests {

    @Test
    @Disabled("in developing =)")
    void test43(){
        Assertions.assertTrue(true);
    }


    @Test
    @Disabled("bad test needs to be improved not included in the report")
    void test42(){
        Assertions.assertTrue(true);
    }
}
