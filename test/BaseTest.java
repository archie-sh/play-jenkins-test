import org.junit.AfterClass;
import org.junit.BeforeClass;
import play.test.FakeApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.start;
import static play.test.Helpers.stop;

/**
 * Created by archie on 02/03/15.
 */
public class BaseTest {

    private static FakeApplication fakeApplication;

    /**
     * <p>
     * Start a fakeApplication and keep it running for the duration of the tests in the class
     * </p>
     */
    @BeforeClass
    public static void startFakeApplication() {
        //Play
        fakeApplication = fakeApplication();
        start(fakeApplication());
    }

    /**
     * <p>
     * Stop the fakeApplication
     * </p>
     */
    @AfterClass
    public static void shutdownFakeApplication() {
        stop(fakeApplication);
    }

}
