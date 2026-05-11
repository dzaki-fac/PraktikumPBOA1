import java.util.List;

public class Teman {
    int nbelm;
    List<String> Lnama;

    public int getNbelm(){
        return this.nbelm;
    }

    public String getNama(int indeks){
        if(indeks >= 0 && indeks < Lnama.size()){
            return Lnama.get(indeks);
        }
        return null;
    }

    public void setNama(int indeks, String nama){
        if(indeks >= 0 && indeks < Lnama.size()){
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama){
        Lnama.remove(nama);
        this.nbelm--;
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru){
        int temp = Lnama.indexOf(nama);
        if(temp != -1){
            this.setNama(temp, namaBaru);
        }
    }

    public int countNama(String nama){
        int count = 0;
        for(String n : Lnama){
            if(n.equalsIgnoreCase(nama)){
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println(Lnama);
    }
}
