/* Nama File   : Coersion.java
 * Pembuat     : Dzaki Fathul 'Alim Cahyo/24060124130103
 * Tanggal     : 27 April 2026
 */

public class Coersion {
    public static void main(String[] args) {

        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;

        System.out.println("Integer: " + nilaiInt);
        System.out.println("Char: " + nilaiChar);
        System.out.println("Double: " + nilaiDouble);

        double realVal = (double) nilaiInt;
        int intLagi = (int) realVal;

        System.out.println("Double: " + realVal);
        System.out.println("Kembali ke Integer: " + intLagi);

        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S (concat): " + S);
        System.out.println("Z (jumlah): " + Z);

        String P = "12.34";
        String Q = "56.78";

        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q); 

        System.out.println("R (concat): " + R);
        System.out.println("D (jumlah): " + D);

        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

        String T = A.toString();
        System.out.println("T: " + T);
    }
}