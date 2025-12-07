public class UjiSDM {
    public static void main(String[] args) {

        ProgrammerMagang p = new ProgrammerMagang("Andi", 50000.0, "1234");

        p.hitungGaji(160);

        System.out.println(p.getStatusCuti());

        p.login("9999");
        p.login("1234");

        System.out.println(p.getRoleAkses());

        p.perpanjangKontrak(6);
        p.logout();
    }
}
