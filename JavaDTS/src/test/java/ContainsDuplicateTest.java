import org.example.W03_Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {
    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        boolean result = W03_Arrays.containsDuplicate(emptyArray);
        assertFalse(result);
    }

    @Test
    public void testOneElementArray() {
        int[] oneElementArray = {1};
        boolean result = W03_Arrays.containsDuplicate(oneElementArray);
        assertFalse(result);
    }

    @Test
    public void testOnlyOneDuplicate() {
        int[] array = {1, 2, 1, 3, 4 ,5};
        boolean result = W03_Arrays.containsDuplicate(array);
        assertTrue(result);
    }

    @Test
    public void testMultipleDuplicate() {
        int[] array = {1, 2, 1, 3, 4 ,5, 2, 5};
        boolean result = W03_Arrays.containsDuplicate(array);
        assertTrue(result);
    }
}
