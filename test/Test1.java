import org.junit.Test;

/**
 * Created by archie on 02/03/15.
 */
public class Test1 extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(4000L);
        System.out.println("Test1");
    }
}
