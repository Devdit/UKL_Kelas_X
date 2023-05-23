package perpusCleine;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman extends Siswa{

    public void prosesPeminjaman(int logSiswa){
        Buku buku = new Buku();
        Siswa siswa = new Siswa();
        
        Scanner Scan = new Scanner(System.in);
        String Activate = " ";
        while(!Activate.equalsIgnoreCase("End")){
            int pilihanBuku = 0;
            int pilihanAwal = 0;
            int i = 0;
            System.out.println("1. Peminjaman\n2. Pengembalian\n3. cek status\n4. Logout");
            pilihanAwal = Scan.nextInt();
            if(pilihanAwal == 1){
            System.out.println("List Buku:");
            for(i = 0; i < buku.getSize(); i++){
                System.out.print((i+1) + ".");
                String listBuku = buku.getNamaBuku(i);
                System.out.print(listBuku);
                System.out.println(" ");
                
            }
            System.out.println("Silahkan Memilih buku:\n");
            pilihanBuku = Scan.nextInt();

            if(siswa.getStatusPinjam(logSiswa) == false){
                System.out.println("Peminjaman berhasil");

                siswa.replaceStatusPinjam(pilihanBuku-1, true);
                buku.setStokAda((pilihanBuku-1), buku.getStokBuku(pilihanBuku-1)-1);
            }
            else{
                System.out.println("kembalikan buku anda terlebih dahulu!");
            }
        }
            else if(pilihanAwal == 2){
                System.out.println("Anda ingin mengembalikan buku?\nYa/Tidak");
                String balikBuku = Scan.nextLine();
                
                if(balikBuku.equalsIgnoreCase("Ya")){
                    siswa.replaceStatusPinjam(i, false);
                    buku.setStokAda((pilihanBuku-1), buku.getStokBuku(pilihanBuku-1)+1);
                }

            }
            
            else if(pilihanAwal == 3){
                if(getStatusPinjam(logSiswa) == false){
                    System.out.println("Anda dapat meminjam!\n");
                }
                else{
                    System.out.println("Anda harus mengembalikan buku anda dahulu!\n");
                }
            }

            else if(pilihanAwal == 4){
                Activate = "End";
            }


        }

}
}
