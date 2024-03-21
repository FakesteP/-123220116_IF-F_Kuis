/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasi;

/**
 *
 * @author Lab Informatika
 */
public class majalah implements hitung{
    private double hargabeli, jumlahbeli;

    public majalah(double jumlahbeli, double hargabeli) {
        this.jumlahbeli = jumlahbeli;
        this.hargabeli = hargabeli;
    }

    public double getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(double hargabeli) {
        this.hargabeli = hargabeli;
    }

    public double getJumlahbeli() {
        return jumlahbeli;
    }

    public void setJumlahbeli(double jumlahbeli) {
        this.jumlahbeli = jumlahbeli;
    }

    @Override
    public double hitungan() {
        return hargabeli * jumlahbeli;
    }
}
