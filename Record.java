package uts;

/**
 *
 * @author INSTIKI
 * Nama : I Kadek Pande Wisnu Antara
 * Nim  : 2201010511
 * TGL  : 16-05-2024
 */

public class Record {
    private String namaPembeli;
    private String alamatEmail;
    private String teleponPembeli;

    public Record(String nama, String email, String telepon) {
        this.namaPembeli = nama;
        this.alamatEmail = email;
        this.teleponPembeli = telepon;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String nama) {
        this.namaPembeli = nama;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String email) {
        this.alamatEmail = email;
    }

    public String getTeleponPembeli() {
        return teleponPembeli;
    }

    public void setTeleponPenyewa(String telepon) {
        this.teleponPembeli = telepon;
    }

    @Override
    public String toString() {
        return "Nama: " + namaPembeli +
                "\nAlamat Email: " + alamatEmail +
                "\nTelepon Pembeli: " + teleponPembeli;
    }

    void setTeleponPembeli(String telepon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}