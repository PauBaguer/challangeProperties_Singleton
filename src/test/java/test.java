import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class test{

    @After
    public void tearDown() {
        I18NManager.getInstance().cleanCache();
    }

    @Before
    public void setUp() {    }

    @Test
    public void testGetText() throws Exception{
        String msg1 = I18NManager.getInstance().getText("ca","l1");
        Assert.assertEquals("hola",msg1);

        String msg1Bis = I18NManager.getInstance().getText("ca","l1");
        Assert.assertEquals("hola",msg1Bis);

        String msg2 = I18NManager.getInstance().getText("ca","l2");
        Assert.assertEquals("mon",msg2);

    }
}
