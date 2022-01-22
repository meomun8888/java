package myabstract;

public class Hinhtron extends Hinh {
    private double r;

    public Hinhtron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }
    @Override
    public double Dientich() {
        return Math.PI * Math.pow(r,2);
    }
}
