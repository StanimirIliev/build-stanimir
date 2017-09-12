import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BusinessObject {

    public final String name;
    public final double price;
    private static final Logger logger = Logger.getLogger(BusinessObject.class);

    public BusinessObject(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args){
        BasicConfigurator.configure();
        logger.debug("Hello world.");
        logger.info("Business objects.");
        System.out.println("My business objects");
    }
}
