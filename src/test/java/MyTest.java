import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyTest extends TestCase {
//public class MyTest {

    private String myStr = null;

    @Before
    public void initData() {
        myStr = "myStr";
    }

    @Test
    public void should() {
        Assert.assertTrue("myStr".equals(myStr));
    }
}
