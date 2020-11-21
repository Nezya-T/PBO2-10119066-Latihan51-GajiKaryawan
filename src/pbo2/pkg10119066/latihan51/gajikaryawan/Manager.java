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
public class Manager extends Karyawan{
  
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public Manager() {
    }

    public Manager(int kehadiran, float tunjanganGolongan, float tunjanganJabatan, float tunjanganKehadiran, String nik, String nama, String jabatan, int golongan) {
        super(nik, nama, jabatan, golongan);
        this.kehadiran = kehadiran;
        this.tunjanganGolongan = tunjanganGolongan;
        this.tunjanganJabatan = tunjanganJabatan;
        this.tunjanganKehadiran = tunjanganKehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public int getKehadiran() {
        return kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        if (hadir >= 1){
            tunjanganKehadiran = hadir*10000;
            
        }
        else{
            tunjanganKehadiran = 0;
        }
        return hadir;
    }
    
    public float tunjanganJabatan(String jabatan){
        
        if (null == jabatan){
            tunjanganJabatan = 0;
        }
        else switch (jabatan) {
            case "Manager":
                tunjanganJabatan = 2000000;
                break;
            case "Kabag":
                tunjanganJabatan = 1000000;
                break;
            default:
                tunjanganJabatan = 0;
                break;
        }
        
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        
        switch (golongan){
            case 1 : tunjanganGolongan = 500000;
            break;
            case 2 : tunjanganGolongan = 1000000;
            break;
            case 3 : tunjanganGolongan = 1500000;
            break;
            
            default : tunjanganGolongan = 0;
        }
        
        return golongan;
    }
    
    public float gajiTotal(){
        
        float gajiTotal = tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
        
        return gajiTotal;
    }
}  

