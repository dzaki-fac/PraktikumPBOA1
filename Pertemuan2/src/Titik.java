/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Dzaki Fathul 'Alim Cahyo / 24060124130103
 * Tanggal     : 19 Februari 2026
 */

public class Titik {

    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (absis,ordinat)
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mengembalikan posisi kuadran titik
    int getKuadran(){
        if(absis >= 0 && ordinat >= 0){
            return 1;
        }else if (absis < 0 && ordinat >= 0){
            return 2;
        }else if (absis < 0 && ordinat < 0){
            return 3;
        }else {
            return 4;
        }
    }

    //mengembalikan jarak titik dengan titik pusat
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    //mengembalikan jarak antara titik dan titik T
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis-T.getAbsis(),2) + Math.pow(ordinat - T.getOrdinat(),2));
    }

    //Mengubah titik (x,y) menjadi (x,-y)
    void RefleksiX(){
        ordinat = ordinat*-1;
    }

    //Mengubah titik (x,y) menjadi (-x,y)
    void RefleksiY(){
        absis = absis*-1;
    }

    //Mengebalikan titik baru yang merupakan refleksi Y titik
    Titik getRefleksiY(){
        Titik temp = new Titik(absis,ordinat*-1);
        return temp;
    }

    //Mengebalikan titik baru yang merupakan refleksi X titik
    Titik getRefleksiX(){
        Titik temp = new Titik(absis*-1,ordinat);
        return temp;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
//end class Titik
