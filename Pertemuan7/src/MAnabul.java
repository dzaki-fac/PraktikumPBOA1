public class MAnabul {
    public static void main(String[] args) {
        Anabul k = new Kucing("Kitty");
        Anabul a = new Anjing("Doggy");
        Anabul b = new Burung("Birdy");

        k.gerak();
        k.bersuara();

        a.gerak();
        a.bersuara();

        b.gerak();
        b.bersuara();
    }
}