package perpusCleine;

import java.util.Scanner;
import java.util.ArrayList;
public class Login {
    public void prosesLogin(){
    Scanner Scan = new Scanner(System.in);
        Peminjaman peminjaman = new Peminjaman();
        Penyetokan penyetokan = new Penyetokan();
        Siswa siswa = new Siswa();
        Petugas petugas = new Petugas();
        Buku buku = new Buku();
        String Activate = " ";
        
        while(!Activate.equalsIgnoreCase("End")){
        String namaLogger, alamatLogger, petugasOrSiswa, teleponLogger= " ";
        int idLogger,  j = 0;
        System.out.println("\nSilahkan \n1.login\n2.Register\n3.exit");
        String logSter = Scan.nextLine();
        if(logSter.equalsIgnoreCase("1")){
            System.out.println("Apakah anda \n1. Petugas\n2. Siswa");
            petugasOrSiswa = Scan.nextLine();
            if(petugasOrSiswa.equalsIgnoreCase("1")){
            System.out.println("Masukkan nama:");
            namaLogger = Scan.nextLine();
            System.out.println("Masukkan ID petugas");
                idLogger = Scan.nextInt();
                for(j = 0; j < petugas.getSize(); j++){
                    if(namaLogger.equalsIgnoreCase(petugas.getNama(j)) && idLogger == petugas.getID(j)){
                        System.out.println("Login berhasil\n");
                        penyetokan.prosesPenyetokan(j);
                    }
                    else{
                        System.out.println("Login gagal");
                    }
                }
                
            
            }
            else if(petugasOrSiswa.equalsIgnoreCase("2")){
                System.out.println("Masukkan nama:");
            namaLogger = Scan.nextLine();
            System.out.println("Masukkan ID Siswa");
                idLogger = Scan.nextInt();
                for(j = 0; j < petugas.getSize(); j++){
                    if(namaLogger.equalsIgnoreCase(siswa.getNama(j)) && idLogger == siswa.getID(j)){
                        System.out.println("Login berhasil");
                        peminjaman.prosesPeminjaman(j);
                    }
                    else{
                        System.out.println("Login gagal");
                    }
                }
                
            
            }

        }
        else if(logSter.equalsIgnoreCase("2")){
                System.out.println("Masukkan nama anda:");
                namaLogger = Scan.nextLine();
                System.out.println("Masukkan ID anda (5 Digit)");
                idLogger = Scan.nextInt();
                System.out.println("Masukkan alamat anda");
                alamatLogger = Scan.nextLine();
                // System.out.println("Masukkan nomor telepon anda");
                teleponLogger = Scan.nextLine();

                System.out.println("Apakah anda:\n1. petugas\n2. Siswa");
                petugasOrSiswa = Scan.nextLine();
            if(petugasOrSiswa.equalsIgnoreCase("1")){
                petugas.setNama(namaLogger);
                petugas.setID(idLogger);
                petugas.setAlamat(alamatLogger);
                petugas.setTelepon(teleponLogger);
            }
            else if(petugasOrSiswa.equalsIgnoreCase("2")){
                siswa.setNama(namaLogger);
                siswa.setID(idLogger);
                siswa.setAlamat(alamatLogger);
                siswa.setTelepon(teleponLogger);
                siswa.setStatusPinjam(false);
            }
            
        }
        else if(logSter.equalsIgnoreCase("3")){
            Activate = "end";
        }
    }
}
}
