import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BusinessLayer{

    private static final Logger logger = Logger.getLogger(BusinessLayer.class);

    public static void main(String argv[]) {
        BasicConfigurator.configure();
        logger.debug("Hello world.");
        logger.info("Business Layer.");
        System.out.println("My business layer");
    }

}