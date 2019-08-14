import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {

    private String input;
    private List<String> expected;
    private Solution soln = new Solution1();

    public SolutionTest(String input, List<String> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {"23", Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf")},
                {"2", Arrays.asList("a","b","c")},
                {"3", Arrays.asList("d","e","f")},
                {"4", Arrays.asList("g","h","i")},
                {"5", Arrays.asList("j","k","l")},
                {"6", Arrays.asList("m","n","o")},
                {"7", Arrays.asList("p","q","r","s")},
                {"8", Arrays.asList("t","u","v")},
                {"9", Arrays.asList("w","x","y","z")}
        });
    }

    @Test
    public void testLetterCombinations() {
        assertEquals(expected, soln.letterCombinations(input));
    }

}