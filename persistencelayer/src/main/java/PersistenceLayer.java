import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class PersistenceLayer{

    private static final Logger logger = Logger.getLogger(PersistenceLayer.class);

    public static void main(String argv[]) {
        BasicConfigurator.configure();
        logger.debug("Hello world.");
        logger.info("Persistence Layer.");
        System.out.println("My persistence layer");
    }

}