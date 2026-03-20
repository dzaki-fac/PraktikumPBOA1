public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return getJmlSisi()*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(sisi*sisi + sisi*sisi);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    @Override
    public void zoomIn(){
        this.sisi = this.sisi*1.1;
    }

    @Override
    public void zoomOut(){
        this.sisi = this.sisi*0.9;
    }

    @Override
    public void zoom(int percent){
        this.sisi = this.sisi*(percent/100);
    }
}
