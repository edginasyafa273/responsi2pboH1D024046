class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    private int poin;
    private String level;

    // TODO: Buat constructor dengan super
    public Member(String nama, String id, int totalBelanja, int poin, String level) {
        super(nama, id, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo(); // panggil info dasar
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}
