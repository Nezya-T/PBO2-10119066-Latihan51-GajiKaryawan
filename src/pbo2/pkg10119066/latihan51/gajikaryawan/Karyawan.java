/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan51.gajikaryawan;

/**
 *
 * @author Neyza-T
 */
public class Karyawan {
    protected String nik;
    protected String nama;
    protected String jabatan;
    protected int golongan;

    public Karyawan() {
    }

    public Karyawan(String nik, String nama, String jabatan, int golongan) {
        this.nik = nik;
        this.nama = nama;
        this.jabatan = jabatan;
        this.golongan = golongan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public int getGolongan() {
        return golongan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

}

    
   
