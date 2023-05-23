package perpusCleine;

import java.util.ArrayList;
import java.util.Scanner;

public class Penyetokan extends Buku{
    Buku buku = new Buku();
    Petugas petugas = new Petugas();

    public void prosesPenyetokan(int logPetugas){
        Scanner Scan = new Scanner(System.in);
        String Activate = " "; 
        String pilihanAwal, inputNama = " ";
        int inputHarga, inputJumlah, i = 0;

            while(!Activate.equalsIgnoreCase("End")){
                System.out.println("Silahkan Memilih \n1. Menambah Buku baru\n2. Menambah stok buku yang sudah ada\n3. Cek Buku\n4. Logout");
                pilihanAwal = Scan.nextLine();
                
                if(pilihanAwal.equalsIgnoreCase("1")){
                    System.out.println("Nama Buku");
                    inputNama = Scan.nextLine();
                    System.out.println("Harga Buku");
                    inputHarga = Scan.nextInt();
                    System.out.println("Input jumlah");
                    inputJumlah = Scan.nextInt();

                    buku.setNamaBuku(inputNama);
                    buku.setHarga(inputHarga);
                    buku.setStok(inputJumlah);

                }
                else if(pilihanAwal.equalsIgnoreCase("2")){
                    System.out.println("List Buku:");
                for(i = 0; i < buku.getSize(); i++){
                System.out.print((i+1) + ".");
                String listBuku = buku.getNamaBuku(i);
                System.out.print(listBuku);
                System.out.println(" ");
                }
                System.out.println("Pilih buku yang ditambahkan");
                inputJumlah = Scan.nextInt();
                System.out.println("Tambahkan seberapa banyak?");
                int seberapaBanyak = Scan.nextInt();
                buku.setStokAda((inputJumlah-1), (buku.getStokBuku(inputJumlah-1)+seberapaBanyak));

            }
                else if(pilihanAwal.equalsIgnoreCase("3")){
                    for(int q = 0; q < buku.getSize(); q++){
                        System.out.println("Nama Buku: "+ buku.getNamaBuku(q));
                        System.out.println("Stok: "+ buku.getStokBuku(q));
                        System.out.println("Harga: "+ buku.getHargaBuku(q));
                        System.out.println(" ");
                    }
                }


                else if(pilihanAwal.equalsIgnoreCase("4")){
                    break;
                }
            }

    }
}
