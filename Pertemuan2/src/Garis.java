public class Garis {
    Titik T1;
    Titik T2;
    static int counterGaris = 0;

    Garis(){
        T1 = new Titik(0,0);
        T2 = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik T1, Titik T2){
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    Titik getT1(){
        return T1;
    }

    Titik getT2(){
        return T2;
    }

    void setT1(Titik T){
        T1 = T;
    }

    void setT2(Titik T){
        T2 = T;
    }

    double getPanjangGaris(){
        double a = T2.getAbsis() - T1.getAbsis(); // x2 - x1
        double b = T2.getOrdinat() - T1.getOrdinat(); // y2 - y1
        return Math.sqrt(a*a + b*b);
    }

    double getGradien(){
        double a = T2.getAbsis() - T1.getAbsis(); // x2 - x1
        double b = T2.getOrdinat() - T1.getOrdinat(); // y2 - y1
        return b/a;
    }

    Titik getTitikTengahGaris(){
        double absis = (T2.getAbsis() + T1.getAbsis())/2;
        double ordinat = (T2.getOrdinat() + T1.getOrdinat())/2;

        Titik T = new Titik(absis,ordinat);
        return T;
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien()*G.getGradien() == -1;
    }

    void printGaris(){
        System.out.println("Garis : T1(" + T1.getAbsis() + "," + T1.getOrdinat() + ")" + " T2(" + T2.getAbsis() + "," + T2.getOrdinat() + ")");
    }

    void printPersamaanGaris(){
        double m = this.getGradien();
        double c = T1.getOrdinat() - m*T1.getAbsis();
        
        System.out.println("y = " + m + "x + " + c);
    }

}
