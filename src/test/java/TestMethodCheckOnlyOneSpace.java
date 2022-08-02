import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Парам. тест для метода {@link Account#checkOnlyOneSpace(String)},
 * которыый проверяет наличие ТОЛЬКО одного пробела в имени
 */


@RunWith(Parameterized.class)
public class TestMethodCheckOnlyOneSpace {
    public String name;
    public Boolean expected;

    public TestMethodCheckOnlyOneSpace(String name, Boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"NAME NAME", true},
                {"NAMENAME", false},
                {"NAME  NAME", false},
                {"", false},
                {null, false}
        };
    }

    @Test
    public void testCheckOnlyOneSpace() {
        Account account = new Account(name);
        boolean actual = account.checkOnlyOneSpace(name);
        Assert.assertEquals(actual, expected);
    }
}
