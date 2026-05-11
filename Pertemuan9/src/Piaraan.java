import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> LAnabul;

    public Piaraan() {
        this.LAnabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul a) {
        this.LAnabul.add(a);
        this.nbelm++;
    }

    public boolean isMember(Anabul a) {
        return this.LAnabul.contains(a);
    }

    public Anabul dequeue() {
        if (nbelm == 0)
            return null;

        Anabul depan = this.LAnabul.poll();
        this.nbelm--;

        return depan;
    }

    public void showAnabul() {
        for (Anabul a : LAnabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : LAnabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : LAnabul) {
            if (a instanceof Kucing) {
                Kucing K = (Kucing) a;
                totalBobot += K.getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        for (Anabul a : LAnabul) {
            System.out.println("Nama: " + a.getNama() + ", Jenis: " + a.getClass().getSimpleName());
        }
    }
}
