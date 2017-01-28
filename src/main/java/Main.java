import Entities.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Car car = ctx.getBean(Car.class);
        System.out.println("Testing XML-based configuration of application context");
        System.out.println("Engine capacity: " + car.getEngine().getEngineCapacity());
        System.out.println("Wheel tyre name: " + car.getWheels().get(0).getTyres().getName());
    }
}
