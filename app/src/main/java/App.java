import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App{

    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String argv[]) {
        BasicConfigurator.configure();
        logger.debug("Hello world.");
        logger.info("App.");
        System.out.println("My app");

        BusinessObject table = new BusinessObject("table", 150);

        System.out.println("Item: " + table.name + " , Price: " + table.price);
    }

}