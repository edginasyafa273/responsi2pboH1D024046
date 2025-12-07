public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================
    private String namaKendaraan;
    private int levelEnergi;        // 0–100
    private int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // default 100%
    }


    // ==========================================================
    // GETTER
    // ==========================================================
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }


    // Setter energi agar bisa dikurangi
    public void setLevelEnergi(int energi) {
        this.levelEnergi = energi;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================
    public final void tampilStatus() {
        System.out.println(getNamaKendaraan() + " | Energi: " +
                getLevelEnergi() + "% | Kapasitas: " +
                getKapasitasPenumpang() + " orang");
    }


    // ==========================================================
    // ABSTRACT METHOD
    // ==========================================================
    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
}



