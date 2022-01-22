package myabstract;

public class HinhChuNhat extends Hinh {
    private int cCao,cRong;

    public HinhChuNhat(ToaDo toaDo, int cCao, int cRong) {
        super(toaDo);
        this.cCao = cCao;
        this.cRong = cRong;
    }

    @Override
    public double Dientich() {
        return cCao * cRong;
    }
}
