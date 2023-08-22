/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author muhammadalifmakkasau
 */
class Pesawat {
    private String kodePesawat;
    private int kapasitasPenumpang;

    public Pesawat(String kodePesawat) {
        this.kodePesawat = kodePesawat;
        this.kapasitasPenumpang = 100;
    }

    public Pesawat(String kodePesawat, int kapasitasPenumpang) {
        this.kodePesawat = kodePesawat;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public void infoPesawat() {
        System.out.println("Kode Pesawat: " + kodePesawat);
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}


