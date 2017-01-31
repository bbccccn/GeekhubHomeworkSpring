import Entitites.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Car car = ctx.getBean(Car.class);
        System.out.println("Testing annotation based config");
        System.out.println("Tyre name: " + car.getWheels().get(0).getTyres().getName());
    }
}
