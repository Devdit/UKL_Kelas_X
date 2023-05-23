package perpusCleine;

import java.util.ArrayList;
public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku(){
        namaBuku.add("Siksa kubur");
        stok.add(15);
        harga.add(200_000);

        namaBuku.add("One Piece");
        stok.add(12);
        harga.add(150_000);

    }
    public void setNamaBuku(String addBuku){
        namaBuku.add(addBuku);
    }
    public void setStok(int addStok){
        stok.add(addStok);
    }
    public void setHarga(int addHarga){
        harga.add(addHarga);
    }
    public void setStokAda(int index, int addStokAda){
        stok.set(index,addStokAda);
    }

    public String getNamaBuku(int getNama){
        return namaBuku.get(getNama);
    }
    public Integer getStokBuku(int getStok){
        return stok.get(getStok);
    }
    public Integer getHargaBuku(int getHarga){
        return harga.get(getHarga);
    }
    public int getSize(){
        return namaBuku.size();
    }
}
