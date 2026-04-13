/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 * */

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
//*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//Tidak dieksekusi. Karena ketika throw di baris 10 jalan, program langsung keluar dari metode dan tidak sempat mencetak kalimat tersebut.

//*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Iya, dieksekusi. Baris tersebut adalah awal blok catch yang bertugas menangkap eksepsi yang dilempar, 
// sehingga program bisa lanjut menjalankan perintah di dalam blok tersebut.