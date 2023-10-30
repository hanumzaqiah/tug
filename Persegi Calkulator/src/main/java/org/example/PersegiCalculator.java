package org.example;

/**
 * Kelas ini digunakan untuk menghitung keliling persegi.
 */
public class PersegiCalculator {
    private double panjangSisi;

    /**
     * Konstruktor untuk membuat objek PersegiCalculator dengan panjang sisi tertentu.
     *
     * @param panjangSisi Panjang sisi persegi.
     */
    public PersegiCalculator(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    /**
     * Menghitung keliling persegi.
     *
     * @return Keliling persegi.
     */
    public double hitungKeliling() {
        return 4 * panjangSisi;
    }

    /**
     * Mendapatkan panjang sisi persegi.
     *
     * @return Panjang sisi persegi.
     */
    public double getPanjangSisi() {
        return panjangSisi;
    }

    /**
     * Mengatur panjang sisi persegi.
     *
     * @param panjangSisi Panjang sisi persegi yang akan diatur.
     */
    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public static void main(String[] args) {
        PersegiCalculator persegi = new PersegiCalculator(5.0);

        double keliling = persegi.hitungKeliling();

        System.out.println("Keliling persegi dengan panjang sisi " + persegi.getPanjangSisi() + " adalah " + keliling);
    }
}