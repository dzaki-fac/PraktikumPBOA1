public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();

        Titik T1 = new Titik(10,10);
        Titik T2 = new Titik();

        Garis G2 = new Garis(T1,T2);

        //..
        System.out.println("Uji Getter");
        System.out.println("Titik awal G2 :");
        G2.getT1().printTitik();

        System.out.println("Titik akhir G2 :");
        G2.getT2().printTitik();
        System.out.println();

        System.out.println("Uji Setter");
        Titik T3 = new Titik(0,0);
        Titik T4 = new Titik(4,-4);

        G2.setT1(T3);
        G2.setT2(T4);

        System.out.println("G2 setelah diubah dengan setter :");
        G2.printGaris();
        System.out.println();

        System.out.println("Gradien G2 setelah setter :");
        System.out.println(G2.getGradien());
        System.out.println();

        System.out.println("Persamaan Garis G2 setelah setter :");
        G2.printPersamaanGaris();
        System.out.println();
        //..

        System.out.println("Garis 1 :");
        G1.printGaris();
        System.out.println();

        System.out.println("Garis 2 :");
        G2.printGaris();
        System.out.println();

        System.out.println("Counter Garis :");
        System.out.println(Garis.getCounterGaris());
        System.out.println();

        System.out.println("Panjang Garis G2 :");
        System.out.println(G2.getPanjangGaris());
        System.out.println();

        System.out.println("Gradien Garis G2 :");
        System.out.println(G2.getGradien());
        System.out.println();

        System.out.println("Titik Tengah Garis G2 :");
        G2.getTitikTengahGaris().printTitik();
        System.out.println();

        System.out.println("Apakah G1 sejajar dengan G2 :");
        System.out.println(G1.isSejajar(G2));
        System.out.println();

        System.out.println("Apakah G1 tegak lurus dengan G2 :");
        System.out.println(G1.isTegakLurus(G2));
        System.out.println();

        System.out.println("Persamaan Garis G2 :");
        G2.printPersamaanGaris();
        // System.out.println();
    }
}
