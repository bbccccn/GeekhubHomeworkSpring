import Entitites.Car;
import Entitites.Configs.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Car car = ctx.getBean(Car.class);
        System.out.println("Testing java based Spring config...");
        System.out.println("Engine capacity: " + car.getEngine().getEngineCapacity());
        System.out.println("Wheel name: " + car.getWheels().get(0).getTyres().getName());
    }
}
