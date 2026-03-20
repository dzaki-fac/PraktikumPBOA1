public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran (double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
    }

    public double getJari (){
        return jari; 
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn(){
        this.jari = this.jari*1.1;
    }

    @Override
    public void zoomOut(){
        this.jari = this.jari*0.9;
    }

    @Override
    public void zoom(int percent){
        this.jari = this.jari*(percent/100);
    }
}