/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan51.gajikaryawan;
 import java.util.Scanner;
/**
 *
 * @author Neyza-T
 */
public class PBO210119066Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Manager karyawan1 = new Manager();
        
        
        
        System.out.println("====Program Perhitungan Gaji Karyawan===");
        System.out.println("Masukkan NIK \t\t\t : ");
        karyawan1.setNik(scanner.nextLine());
        System.out.println("Masukkan Nama \t\t\t : ");
        karyawan1.setNama(scanner.nextLine());
        System.out.println("Masukkan Golongan (1/2/3) \t : ");
        karyawan1.setGolongan(scanner.nextInt());
        System.out.println("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan1.setJabatan(scanner.next());
        System.out.println("Masukkan Jumlah Kehadiran \t : ");
        karyawan1.setKehadiran(scanner.nextInt());
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t\t\t\t : " + karyawan1.getNik());
        System.out.println("NAMA \t\t\t\t : " + karyawan1.getNama());
        System.out.println("GOLONGAN \t\t\t : " + karyawan1.getGolongan());
        System.out.println("JABATAN\t\t\t\t : " + karyawan1.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN \t\t : " + karyawan1.tunjanganGolongan(karyawan1.getGolongan()));
        System.out.println("TUNJANGAn JABATAN \t\t : " + karyawan1.tunjanganJabatan(karyawan1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t\t : " + karyawan1.tunjanganKehadiran(karyawan1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL \t\t\t : " + karyawan1.gajiTotal());
    }
}