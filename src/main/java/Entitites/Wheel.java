package Entitites;

import org.springframework.beans.factory.annotation.Autowired;

public class Wheel {
    @Autowired
    private Tyres tyres;

    public Wheel() {
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
