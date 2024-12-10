import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
public class TestLogger {
    private static Logger logger = LoggerFactory.getLogger(TestLogger.class);

    @Test
    public void test_trace(){
        logger.trace("Trace");
    }

    @Test
    public void test_debug(){
        logger.debug("Debug");
    }

    @Test
    public void test_error(){
        logger.error("Error");
    }

    @Test
    public void test_info(){
        logger.info("Info");
    }

    @Test
    public void test_warn(){
        logger.warn("Warn");
    }
}
