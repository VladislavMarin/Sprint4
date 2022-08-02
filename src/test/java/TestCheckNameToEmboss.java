import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Тест для метода {@link Account#checkNameToEmboss()}
 * Проверяется валидация имени на карте
 */


@RunWith(Parameterized.class)
public class TestCheckNameToEmboss {
    public String name;
    public Boolean expected;

    public TestCheckNameToEmboss(String name, Boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{

                {"NAME NAME", true},
                {"NAMENAME", false},
                {" NAMENAME", false},
                {"NAMENAME ", false},
                {" NAME NAME", false},
                {"NAME NAME ", false},
                {"", false},
                {"NAMENAMENAMENAMENAMENAME", false},
                {"NA", false},
                {"NAMENAME NAMENAME45", true},
                {"N M", true},
        };
    }

    @Test
    public void testCheckNameToEmboss() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        Assert.assertEquals(actual, expected);
    }
}
