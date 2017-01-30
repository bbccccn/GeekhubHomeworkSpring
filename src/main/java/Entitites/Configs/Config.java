package Entitites.Configs;

import Entitites.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class Config {
    @Bean
    public Car car() {
        return new Car(Collections.singletonList(wheel()),engine());
    }

    @Bean
    public Engine engine(){
        return new Engine();
    }

    @Bean
    public Wheel wheel(){
        return new Wheel(tyres());
    }

    @Bean
    public Tyres tyres(){
        return new WinterTyres(21.2, "Dat Wheel");
    }
}
