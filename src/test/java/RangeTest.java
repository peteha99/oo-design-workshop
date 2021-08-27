import Range.Range;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RangeTest {
    @Test
    public void testStartWithInclusiveWithKampooShouldBeTrue() {
        Range range = new Range("[1,5]");

        boolean actualResult = range.isEndWithInclusive();

        assertTrue(actualResult);
    }
}
