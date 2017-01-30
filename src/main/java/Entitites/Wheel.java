package Entitites;

public class Wheel {
    private Tyres tyres;

    public Wheel() {
    }

    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
