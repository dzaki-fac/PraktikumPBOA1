public class Kendaraan {
    private String noPlat;
    private String jenis;

    Kendaraan(){
        noPlat = "0";
        jenis = "";
    }

    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }


}
