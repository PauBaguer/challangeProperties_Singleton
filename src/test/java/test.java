import junit.framework.*;
public class test extends TestCase{
    protected String lang, res;
    protected void setUp(){
        lang = "ca";
        res = "hola";
    }

    public void testLanguage(){
        assertSame(getLi(lang), res);
    }
}
