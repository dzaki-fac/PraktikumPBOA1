public class Lingkaran extends BangunDatar{
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
}