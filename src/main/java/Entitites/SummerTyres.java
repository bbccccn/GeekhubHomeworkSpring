package Entitites;

import org.springframework.stereotype.Service;

@Service("summerTyres")
public class SummerTyres extends Tyres{
    public SummerTyres(){
        this.setName("Last wheel");
        this.setSize(19.1);
    }
}
